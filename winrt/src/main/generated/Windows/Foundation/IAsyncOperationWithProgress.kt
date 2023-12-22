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
@ABIMarker(IAsyncOperationWithProgress.ABI::class)
@Guid("b5d036d7e297498fba600289e76e23dd")
@WinRTByReference(IAsyncOperationWithProgress.ByReference::class)
@TypeHash("__1501168087_Type")
public interface IAsyncOperationWithProgress<TResult, TProgress> : NativeMapped, IWinRTInterface,
    IAsyncInfo.WithDefault {
  public val __1501168087_Ptr: Pointer?

  public val _1501168087_VtblPtr: Pointer?
    get() = __1501168087_Ptr?.getPointer(0)

  public val __1501168087_Type: KType?

  public fun put_Progress(handler: AsyncOperationProgressHandler<TResult, TProgress>?): Unit {
    if (__1501168087_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1501168087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1501168087_Ptr,marshalToNative(handler)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Progress(): AsyncOperationProgressHandler<TResult, TProgress>? {
    if (__1501168087_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1501168087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<AsyncOperationProgressHandler<TResult, TProgress>>(
    AsyncOperationProgressHandler::class.createType(listOf(
      __1501168087_Type!!.arguments[0],
      __1501168087_Type!!.arguments[1],
    )))
    val hr = fn.invokeHR(arrayOf(__1501168087_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = AsyncOperationProgressHandler::class.createType(listOf(
      __1501168087_Type!!.arguments[0],
      __1501168087_Type!!.arguments[1],
    ))
    return marshalFromNative<AsyncOperationProgressHandler<TResult, TProgress>>(result.getValue(),
        returnType!!)
  }

  public fun put_Completed(handler: AsyncOperationWithProgressCompletedHandler<TResult,
      TProgress>?): Unit {
    if (__1501168087_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1501168087_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1501168087_Ptr,marshalToNative(handler)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationWithProgressCompletedHandler<TResult, TProgress>? {
    if (__1501168087_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1501168087_VtblPtr!!.getPointer(9L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<AsyncOperationWithProgressCompletedHandler<TResult,
        TProgress>>(
    AsyncOperationWithProgressCompletedHandler::class.createType(listOf(
      __1501168087_Type!!.arguments[0],
      __1501168087_Type!!.arguments[1],
    )))
    val hr = fn.invokeHR(arrayOf(__1501168087_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = AsyncOperationWithProgressCompletedHandler::class.createType(listOf(
      __1501168087_Type!!.arguments[0],
      __1501168087_Type!!.arguments[1],
    ))
    return marshalFromNative<AsyncOperationWithProgressCompletedHandler<TResult,
        TProgress>>(result.getValue(), returnType!!)
  }

  public fun GetResults(): TResult {
    if (__1501168087_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1501168087_VtblPtr!!.getPointer(10L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<TResult>(__1501168087_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1501168087_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1501168087_Type!!.arguments[0]
    return marshalFromNative<TResult>(result.getValue(), returnType.type!!)as TResult
  }

  public class ByReference<TResult, TProgress> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsyncOperationWithProgress<TResult, TProgress>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IAsyncOperationWithProgress<TResult, TProgress> =
        ABI.makeIAsyncOperationWithProgress<TResult, TProgress>(pointer.getPointer(0), type!!)

    public fun setValue(value: IAsyncOperationWithProgress<TResult, TProgress>): Unit {
      pointer = value.__1501168087_Ptr!!
    }
  }

  public class IAsyncOperationWithProgressImpl<TResult, TProgress>(
    ptr: JNAPointer? = NULL,
    public override var __1501168087_Type: KType? = null
  ) : PointerType(ptr), IAsyncOperationWithProgress<TResult, TProgress> {
    public override val __1501168087_Ptr: JNAPointer?
      get() = pointer

    public override val _1501168087_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1646648641_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IAsyncInfo>())
      val result = PointerByReference()
      IUnknownVtbl(_1501168087_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <TResult, TProgress> invoke(type: KType, ptr: JNAPointer?):
          IAsyncOperationWithProgress<TResult, TProgress> = IAsyncOperationWithProgressImpl(ptr,
          type)

      public inline operator fun <reified TResult, reified TProgress> invoke(ptr: JNAPointer?):
          IAsyncOperationWithProgress<TResult, TProgress> =
          IAsyncOperationWithProgressImpl(typeOf<IAsyncOperationWithProgress<TResult,
          TProgress>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IAsyncOperationWithProgress<*, *>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <TResult, TProgress> makeIAsyncOperationWithProgress(ptr: JNAPointer?, type: KType) =
        IAsyncOperationWithProgressImpl<TResult, TProgress>(type, ptr)

    public inline fun <reified TResult, reified TProgress>
        makeIAsyncOperationWithProgress(ptr: JNAPointer?) =
        IAsyncOperationWithProgressImpl.invoke<TResult, TProgress>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress):
        IAsyncOperationWithProgress<*, *> {
      val address = segment.toRawLongValue()
      return makeIAsyncOperationWithProgress<Unit, Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IAsyncOperationWithProgress<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1501168087_Ptr))
  }
}
