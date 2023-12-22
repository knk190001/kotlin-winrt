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

public fun interface AsyncActionProgressHandlerBody<TProgress> {
  public operator fun invoke(asyncInfo: IAsyncActionWithProgress<TProgress>?,
      progressInfo: TProgress?): Unit
}

@ABIMarker(AsyncActionProgressHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("6d8448580cff4590ae8995a5a5c8b4b8")
@WinRTByReference(AsyncActionProgressHandler.ByReference::class)
public class AsyncActionProgressHandler<TProgress>(
  public val type: KType? = null,
  public val body: AsyncActionProgressHandlerBody<TProgress>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(asyncInfo: IAsyncActionWithProgress<TProgress>,
      progressInfo: TProgress): Unit {
    body!!(asyncInfo, progressInfo)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( AsyncActionProgressHandler::class.java, "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, AsyncActionProgressHandlerBody::class.java, MemoryAddress::class.java,
            MemoryAddress::class.java, Any::class.java, )

      )

    public inline operator fun <reified TProgress>
        invoke(fn: AsyncActionProgressHandlerBody<TProgress>):
        AsyncActionProgressHandler<TProgress> {
      val session = MemorySession.global()
      val handleDescriptorPair =
          transformParameterizedHandle(typeOf<AsyncActionProgressHandler<TProgress>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate = AsyncActionProgressHandler(typeOf<AsyncActionProgressHandler<TProgress>>(),
          fn, Memory(12))
      val guid = guidOf<AsyncActionProgressHandler<TProgress>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <TProgress> invoke(type: KType, ptr: Pointer?):
        AsyncActionProgressHandler<TProgress> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: AsyncActionProgressHandlerBody<TProgress> =
          AsyncActionProgressHandlerBody<TProgress>  {
        asyncInfo, progressInfo ->
        val asyncInfo_Native = asyncInfo!!.toNative() as Pointer
        val hr = function.invokeHR(arrayOf(thisPtr, asyncInfo_Native, marshalToNative(progressInfo,
            type!!.arguments[0].type!!)))
        checkHR(hr)
      }
      return AsyncActionProgressHandler(type, body, thisPtr)
    }

    public inline operator fun <reified TProgress> invoke(pointer: Pointer?):
        AsyncActionProgressHandler<TProgress> {
      val type = typeOf<AsyncActionProgressHandler<TProgress>>()
      return AsyncActionProgressHandler(type, pointer)
    }

    @JvmStatic
    public fun <TProgress> nativeFn(
      type: KType,
      fn: AsyncActionProgressHandlerBody<TProgress>,
      thisPtr: MemoryAddress,
      asyncInfo: MemoryAddress,
      progressInfo: Any
    ): Int {
      try {
        val asyncInfo_Type = Windows.Foundation.IAsyncActionWithProgress::class.createType(listOf(
              type!!.arguments[0],
            ))
        val asyncInfo_Managed =
            IAsyncActionWithProgress.ABI.makeIAsyncActionWithProgress<TProgress>(Pointer(asyncInfo.toRawLongValue()),
            asyncInfo_Type)
        val progressInfo_Type = type!!.arguments[0].type!!
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

  public class ByReference<TProgress> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsyncActionProgressHandler<TProgress>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): AsyncActionProgressHandler<TProgress> =
        AsyncActionProgressHandler<TProgress>(type!!, pointer.getPointer(0))

    public fun setValue(value: AsyncActionProgressHandler<TProgress>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<AsyncActionProgressHandler<*>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress):
        AsyncActionProgressHandler<*> {
      val address = segment.toRawLongValue()
      return AsyncActionProgressHandler<Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: AsyncActionProgressHandler<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
