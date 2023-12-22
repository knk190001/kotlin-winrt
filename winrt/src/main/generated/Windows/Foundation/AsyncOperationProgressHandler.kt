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
import kotlin.Any
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

public fun interface AsyncOperationProgressHandlerBody<TResult, TProgress> {
  public operator fun invoke(asyncInfo: IAsyncOperationWithProgress<TResult, TProgress>?,
      progressInfo: TProgress?): Unit
}

@ABIMarker(AsyncOperationProgressHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("556909020aab421a8778f8ce5026d758")
@WinRTByReference(AsyncOperationProgressHandler.ByReference::class)
public class AsyncOperationProgressHandler<TResult, TProgress>(
  public val type: KType? = null,
  public val body: AsyncOperationProgressHandlerBody<TResult, TProgress>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(asyncInfo: IAsyncOperationWithProgress<TResult, TProgress>,
      progressInfo: TProgress): Unit {
    body!!(asyncInfo, progressInfo)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( AsyncOperationProgressHandler::class.java,
          "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, AsyncOperationProgressHandlerBody::class.java, MemoryAddress::class.java,
            MemoryAddress::class.java, Any::class.java, )

      )

    public inline operator fun <reified TResult, reified TProgress>
        invoke(fn: AsyncOperationProgressHandlerBody<TResult, TProgress>):
        AsyncOperationProgressHandler<TResult, TProgress> {
      val session = MemorySession.global()
      val handleDescriptorPair =
          transformParameterizedHandle(typeOf<AsyncOperationProgressHandler<TResult, TProgress>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate = AsyncOperationProgressHandler(typeOf<AsyncOperationProgressHandler<TResult,
          TProgress>>(), fn, Memory(12))
      val guid = guidOf<AsyncOperationProgressHandler<TResult, TProgress>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <TResult, TProgress> invoke(type: KType, ptr: Pointer?):
        AsyncOperationProgressHandler<TResult, TProgress> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: AsyncOperationProgressHandlerBody<TResult, TProgress> =
          AsyncOperationProgressHandlerBody<TResult, TProgress>  {
        asyncInfo, progressInfo ->
        val asyncInfo_Native = asyncInfo!!.toNative() as Pointer
        val hr = function.invokeHR(arrayOf(thisPtr, asyncInfo_Native, marshalToNative(progressInfo,
            type!!.arguments[1].type!!)))
        checkHR(hr)
      }
      return AsyncOperationProgressHandler(type, body, thisPtr)
    }

    public inline operator fun <reified TResult, reified TProgress> invoke(pointer: Pointer?):
        AsyncOperationProgressHandler<TResult, TProgress> {
      val type = typeOf<AsyncOperationProgressHandler<TResult, TProgress>>()
      return AsyncOperationProgressHandler(type, pointer)
    }

    @JvmStatic
    public fun <TResult, TProgress> nativeFn(
      type: KType,
      fn: AsyncOperationProgressHandlerBody<TResult, TProgress>,
      thisPtr: MemoryAddress,
      asyncInfo: MemoryAddress,
      progressInfo: Any
    ): Int {
      try {
        val asyncInfo_Type =
            Windows.Foundation.IAsyncOperationWithProgress::class.createType(listOf(
              type!!.arguments[0],
              type!!.arguments[1],
            ))
        val asyncInfo_Managed =
            IAsyncOperationWithProgress.ABI.makeIAsyncOperationWithProgress<TResult,
            TProgress>(Pointer(asyncInfo.toRawLongValue()), asyncInfo_Type)
        val progressInfo_Type = type!!.arguments[1].type!!
        val progressInfo_Managed = runtimeFromNativeJF<Any>(progressInfo, progressInfo_Type) as
            TProgress
        fn(asyncInfo_Managed, progressInfo_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public class ByReference<TResult, TProgress> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsyncOperationProgressHandler<TResult, TProgress>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): AsyncOperationProgressHandler<TResult, TProgress> =
        AsyncOperationProgressHandler<TResult, TProgress>(type!!, pointer.getPointer(0))

    public fun setValue(value: AsyncOperationProgressHandler<TResult, TProgress>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<AsyncOperationProgressHandler<*, *>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress):
        AsyncOperationProgressHandler<*, *> {
      val address = segment.toRawLongValue()
      return AsyncOperationProgressHandler<Unit, Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: AsyncOperationProgressHandler<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
