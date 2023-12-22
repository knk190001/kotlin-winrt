package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.IllegalStateException
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IAsyncActionWithProgress.ABI::class)
@Guid("1f6db258e80348a19546eb7353398884")
@WinRTByReference(IAsyncActionWithProgress.ByReference::class)
@TypeHash("__166973766_Type")
public interface IAsyncActionWithProgress<TProgress> : NativeMapped, IWinRTInterface,
    IAsyncInfo.WithDefault {
  public val __166973766_Ptr: Pointer?

  public val _166973766_VtblPtr: Pointer?
    get() = __166973766_Ptr?.getPointer(0)

  public val __166973766_Type: KType?

  public fun put_Progress(handler: AsyncActionProgressHandler<TProgress>?): Unit {
    if (__166973766_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _166973766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__166973766_Ptr,marshalToNative(handler)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Progress(): AsyncActionProgressHandler<TProgress>? {
    if (__166973766_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _166973766_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<AsyncActionProgressHandler<TProgress>>(
    AsyncActionProgressHandler::class.createType(listOf(
      __166973766_Type!!.arguments[0],
    )))
    val hr = fn.invokeHR(arrayOf(__166973766_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = AsyncActionProgressHandler::class.createType(listOf(
      __166973766_Type!!.arguments[0],
    ))
    return marshalFromNative<AsyncActionProgressHandler<TProgress>>(result.getValue(), returnType!!)
  }

  public fun put_Completed(handler: AsyncActionWithProgressCompletedHandler<TProgress>?): Unit {
    if (__166973766_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _166973766_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__166973766_Ptr,marshalToNative(handler)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncActionWithProgressCompletedHandler<TProgress>? {
    if (__166973766_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _166973766_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<AsyncActionWithProgressCompletedHandler<TProgress>>(
    AsyncActionWithProgressCompletedHandler::class.createType(listOf(
      __166973766_Type!!.arguments[0],
    )))
    val hr = fn.invokeHR(arrayOf(__166973766_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = AsyncActionWithProgressCompletedHandler::class.createType(listOf(
      __166973766_Type!!.arguments[0],
    ))
    return marshalFromNative<AsyncActionWithProgressCompletedHandler<TProgress>>(result.getValue(),
        returnType!!)
  }

  public fun GetResults(): Unit {
    if (__166973766_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _166973766_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__166973766_Ptr,))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public class ByReference<TProgress> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsyncActionWithProgress<TProgress>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IAsyncActionWithProgress<TProgress> =
        ABI.makeIAsyncActionWithProgress<TProgress>(pointer.getPointer(0), type!!)

    public fun setValue(value: IAsyncActionWithProgress<TProgress>): Unit {
      pointer = value.__166973766_Ptr!!
    }
  }

  public class IAsyncActionWithProgressImpl<TProgress>(
    ptr: JNAPointer? = NULL,
    public override var __166973766_Type: KType? = null
  ) : PointerType(ptr), IAsyncActionWithProgress<TProgress> {
    public override val __166973766_Ptr: JNAPointer?
      get() = pointer

    public override val _166973766_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1646648641_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IAsyncInfo>())
      val result = PointerByReference()
      IUnknownVtbl(_166973766_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <TProgress> invoke(type: KType, ptr: JNAPointer?):
          IAsyncActionWithProgress<TProgress> = IAsyncActionWithProgressImpl(ptr, type)

      public inline operator fun <reified TProgress> invoke(ptr: JNAPointer?):
          IAsyncActionWithProgress<TProgress> =
          IAsyncActionWithProgressImpl(typeOf<IAsyncActionWithProgress<TProgress>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IAsyncActionWithProgress<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <TProgress> makeIAsyncActionWithProgress(ptr: JNAPointer?, type: KType) =
        IAsyncActionWithProgressImpl<TProgress>(type, ptr)

    public inline fun <reified TProgress> makeIAsyncActionWithProgress(ptr: JNAPointer?) =
        IAsyncActionWithProgressImpl.invoke<TProgress>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress):
        IAsyncActionWithProgress<*> {
      val address = segment.toRawLongValue()
      return makeIAsyncActionWithProgress<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IAsyncActionWithProgress<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__166973766_Ptr))
  }
}
