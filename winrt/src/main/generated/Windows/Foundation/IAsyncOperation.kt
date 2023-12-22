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
@ABIMarker(IAsyncOperation.ABI::class)
@Guid("9fc2b0bbe44644e2aa619cab8f636af2")
@WinRTByReference(IAsyncOperation.ByReference::class)
@TypeHash("__1681603062_Type")
public interface IAsyncOperation<TResult> : NativeMapped, IWinRTInterface, IAsyncInfo.WithDefault {
  public val __1681603062_Ptr: Pointer?

  public val _1681603062_VtblPtr: Pointer?
    get() = __1681603062_Ptr?.getPointer(0)

  public val __1681603062_Type: KType?

  public fun put_Completed(handler: AsyncOperationCompletedHandler<TResult>?): Unit {
    if (__1681603062_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1681603062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val hr = fn.invokeHR(arrayOf(__1681603062_Ptr,marshalToNative(handler)))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
  }

  public fun get_Completed(): AsyncOperationCompletedHandler<TResult>? {
    if (__1681603062_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1681603062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<AsyncOperationCompletedHandler<TResult>>(
    AsyncOperationCompletedHandler::class.createType(listOf(
      __1681603062_Type!!.arguments[0],
    )))
    val hr = fn.invokeHR(arrayOf(__1681603062_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = AsyncOperationCompletedHandler::class.createType(listOf(
      __1681603062_Type!!.arguments[0],
    ))
    return marshalFromNative<AsyncOperationCompletedHandler<TResult>>(result.getValue(),
        returnType!!)
  }

  public fun GetResults(): TResult {
    if (__1681603062_Type == null) {
      throw IllegalStateException("Type has not been initialized")
    }
    val fnPtr = _1681603062_VtblPtr!!.getPointer(8L * POINTER_SIZE)
    val fn = Function.getFunction(fnPtr)
    val result = makeByReferenceType<TResult>(__1681603062_Type!!.arguments[0].type!!)
    val hr = fn.invokeHR(arrayOf(__1681603062_Ptr,result))
    if( hr.toInt() != 0) {
      throw RuntimeException(hr.toString())
    }
    val returnType = __1681603062_Type!!.arguments[0]
    return marshalFromNative<TResult>(result.getValue(), returnType.type!!)as TResult
  }

  public class ByReference<TResult> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsyncOperation<TResult>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): IAsyncOperation<TResult> =
        ABI.makeIAsyncOperation<TResult>(pointer.getPointer(0), type!!)

    public fun setValue(value: IAsyncOperation<TResult>): Unit {
      pointer = value.__1681603062_Ptr!!
    }
  }

  public class IAsyncOperationImpl<TResult>(
    ptr: JNAPointer? = NULL,
    public override var __1681603062_Type: KType? = null
  ) : PointerType(ptr), IAsyncOperation<TResult> {
    public override val __1681603062_Ptr: JNAPointer?
      get() = pointer

    public override val _1681603062_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1646648641_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IAsyncInfo>())
      val result = PointerByReference()
      IUnknownVtbl(_1681603062_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun <TResult> invoke(type: KType, ptr: JNAPointer?): IAsyncOperation<TResult>
          = IAsyncOperationImpl(ptr, type)

      public inline operator fun <reified TResult> invoke(ptr: JNAPointer?):
          IAsyncOperation<TResult> = IAsyncOperationImpl(typeOf<IAsyncOperation<TResult>>(),ptr)
    }
  }

  public object ABI : IParameterizedABI<IAsyncOperation<*>, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun <TResult> makeIAsyncOperation(ptr: JNAPointer?, type: KType) =
        IAsyncOperationImpl<TResult>(type, ptr)

    public inline fun <reified TResult> makeIAsyncOperation(ptr: JNAPointer?) =
        IAsyncOperationImpl.invoke<TResult>( ptr)

    public override fun fromNative(type: KType, segment: MemoryAddress): IAsyncOperation<*> {
      val address = segment.toRawLongValue()
      return makeIAsyncOperation<Unit>(Pointer(address), type)
    }

    public override fun toNative(obj: IAsyncOperation<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.__1681603062_Ptr))
  }
}
