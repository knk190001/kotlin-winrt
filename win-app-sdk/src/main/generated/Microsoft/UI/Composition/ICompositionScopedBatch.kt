package Microsoft.UI.Composition

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionScopedBatch.ABI::class)
@Signature("{d31ca572-99ce-5969-b042-6c2d330a3859}")
@Guid("d31ca57299ce5969b0426c2d330a3859")
@WinRTInterface("d31ca57299ce5969b0426c2d330a3859")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionScopedBatch.ByReference::class)
public interface ICompositionScopedBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(1)
  public fun get_IsEnded(): Boolean

  @InterfaceMethod(2)
  public fun End(): Unit

  @InterfaceMethod(3)
  public fun Resume(): Unit

  @InterfaceMethod(4)
  public fun Suspend(): Unit

  @InterfaceMethod(5)
  public fun add_Completed(handler: TypedEventHandler<IUnknown?,
      CompositionBatchCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionScopedBatch> {
    public override fun getValue() = ABI.makeICompositionScopedBatch(pointer.getPointer(0))

    public fun setValue(value: ICompositionScopedBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionScopedBatch {
    public val __1350452185_Ptr: Pointer?

    public val _1350452185_VtblPtr: Pointer?
      get() = __1350452185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsEnded(): Boolean {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun End(): Unit {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Resume(): Unit {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Suspend(): Unit {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Completed(handler: TypedEventHandler<IUnknown?,
        CompositionBatchCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1350452185_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350452185_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionScopedBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1350452185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionScopedBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d31ca57299ce5969b0426c2d330a3859")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionScopedBatch(ptr: Pointer?): WithDefault =
        ICompositionScopedBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionScopedBatch {
      val address = segment.toRawLongValue()
      return makeICompositionScopedBatch(Pointer(address))
    }

    public override fun toNative(obj: ICompositionScopedBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1350452185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionScopedBatch): Array<ICompositionScopedBatch?>
        = (elements as
        Array<ICompositionScopedBatch?>).castToImpl<ICompositionScopedBatch,ICompositionScopedBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionScopedBatch?> =
        arrayOfNulls<ICompositionScopedBatch_Impl>(size) as Array<ICompositionScopedBatch?>
  }
}
