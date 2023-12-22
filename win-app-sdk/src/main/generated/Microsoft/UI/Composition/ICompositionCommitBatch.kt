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

@ABIMarker(ICompositionCommitBatch.ABI::class)
@Signature("{c4550fa8-a7f2-5259-bf74-33b2f5240a28}")
@Guid("c4550fa8a7f25259bf7433b2f5240a28")
@WinRTInterface("c4550fa8a7f25259bf7433b2f5240a28")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionCommitBatch.ByReference::class)
public interface ICompositionCommitBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(1)
  public fun get_IsEnded(): Boolean

  @InterfaceMethod(2)
  public fun add_Completed(handler: TypedEventHandler<IUnknown?,
      CompositionBatchCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionCommitBatch> {
    public override fun getValue() = ABI.makeICompositionCommitBatch(pointer.getPointer(0))

    public fun setValue(value: ICompositionCommitBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionCommitBatch {
    public val __73299858_Ptr: Pointer?

    public val _73299858_VtblPtr: Pointer?
      get() = __73299858_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _73299858_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__73299858_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsEnded(): Boolean {
      val fnPtr = _73299858_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__73299858_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_Completed(handler: TypedEventHandler<IUnknown?,
        CompositionBatchCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _73299858_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__73299858_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _73299858_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__73299858_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionCommitBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __73299858_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionCommitBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4550fa8a7f25259bf7433b2f5240a28")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionCommitBatch(ptr: Pointer?): WithDefault =
        ICompositionCommitBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionCommitBatch {
      val address = segment.toRawLongValue()
      return makeICompositionCommitBatch(Pointer(address))
    }

    public override fun toNative(obj: ICompositionCommitBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__73299858_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionCommitBatch): Array<ICompositionCommitBatch?>
        = (elements as
        Array<ICompositionCommitBatch?>).castToImpl<ICompositionCommitBatch,ICompositionCommitBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionCommitBatch?> =
        arrayOfNulls<ICompositionCommitBatch_Impl>(size) as Array<ICompositionCommitBatch?>
  }
}
