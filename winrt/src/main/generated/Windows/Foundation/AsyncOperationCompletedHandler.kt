package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.interop.runtimeFromNativeJF
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toFunctionDescriptor
import com.github.knk190001.winrtbinding.runtime.transformParameterizedHandle
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.Linker
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

public fun interface AsyncOperationCompletedHandlerBody<TResult> {
  public operator fun invoke(asyncInfo: IAsyncOperation<TResult>?, asyncStatus: AsyncStatus?): Unit
}

@ABIMarker(AsyncOperationCompletedHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("fcdcf02ce5d84478915a4d90b74b83a5")
@WinRTByReference(AsyncOperationCompletedHandler.ByReference::class)
public class AsyncOperationCompletedHandler<TResult>(
  public val type: KType? = null,
  public val body: AsyncOperationCompletedHandlerBody<TResult>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(asyncInfo: IAsyncOperation<TResult>, asyncStatus: AsyncStatus): Unit {
    body!!(asyncInfo, asyncStatus)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( AsyncOperationCompletedHandler::class.java,
          "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, AsyncOperationCompletedHandlerBody::class.java,
            MemoryAddress::class.java, MemoryAddress::class.java, Int::class.java, )

      )

    public inline operator fun <reified TResult>
        invoke(fn: AsyncOperationCompletedHandlerBody<TResult>):
        AsyncOperationCompletedHandler<TResult> {
      val session = MemorySession.global()
      val handleDescriptorPair =
          transformParameterizedHandle(typeOf<AsyncOperationCompletedHandler<TResult>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate =
          AsyncOperationCompletedHandler(typeOf<AsyncOperationCompletedHandler<TResult>>(), fn,
          Memory(12))
      val guid = guidOf<AsyncOperationCompletedHandler<TResult>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <TResult> invoke(type: KType, ptr: Pointer?):
        AsyncOperationCompletedHandler<TResult> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: AsyncOperationCompletedHandlerBody<TResult> =
          AsyncOperationCompletedHandlerBody<TResult>  {
        asyncInfo, asyncStatus ->
        val asyncInfo_Native = asyncInfo!!.toNative() as Pointer
        val hr = function.invokeHR(arrayOf(thisPtr, asyncInfo_Native, asyncStatus))
        checkHR(hr)
      }
      return AsyncOperationCompletedHandler(type, body, thisPtr)
    }

    public inline operator fun <reified TResult> invoke(pointer: Pointer?):
        AsyncOperationCompletedHandler<TResult> {
      val type = typeOf<AsyncOperationCompletedHandler<TResult>>()
      return AsyncOperationCompletedHandler(type, pointer)
    }

    @JvmStatic
    public fun <TResult> nativeFn(
      type: KType,
      fn: AsyncOperationCompletedHandlerBody<TResult>,
      thisPtr: MemoryAddress,
      asyncInfo: MemoryAddress,
      asyncStatus: Int
    ): Int {
      try {
        val asyncInfo_Type = Windows.Foundation.IAsyncOperation::class.createType(listOf(
              type!!.arguments[0],
            ))
        val asyncInfo_Managed =
            IAsyncOperation.ABI.makeIAsyncOperation<TResult>(Pointer(asyncInfo.toRawLongValue()),
            asyncInfo_Type)
        val asyncStatus_Managed = AsyncStatus.ABI.fromNative(asyncStatus)
        fn(asyncInfo_Managed, asyncStatus_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public class ByReference<TResult> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsyncOperationCompletedHandler<TResult>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): AsyncOperationCompletedHandler<TResult> =
        AsyncOperationCompletedHandler<TResult>(type!!, pointer.getPointer(0))

    public fun setValue(value: AsyncOperationCompletedHandler<TResult>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<AsyncOperationCompletedHandler<*>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress):
        AsyncOperationCompletedHandler<*> {
      val address = segment.toRawLongValue()
      return AsyncOperationCompletedHandler<Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: AsyncOperationCompletedHandler<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
