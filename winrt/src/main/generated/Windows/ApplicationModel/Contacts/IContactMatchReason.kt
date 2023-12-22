package Windows.ApplicationModel.Contacts

import Windows.Data.Text.TextSegment
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactMatchReason.ABI::class)
@Signature("{bc922504-e7d8-413e-95f4-b75c54c74077}")
@Guid("bc922504e7d8413e95f4b75c54c74077")
@WinRTInterface("bc922504e7d8413e95f4b75c54c74077")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactMatchReason.ByReference::class)
public interface IContactMatchReason : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Field(): ContactMatchReasonKind?

  @InterfaceMethod(1)
  public fun get_Segments(): IVectorView<TextSegment?>?

  @InterfaceMethod(2)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactMatchReason> {
    public override fun getValue() = ABI.makeIContactMatchReason(pointer.getPointer(0))

    public fun setValue(value: IContactMatchReason_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactMatchReason {
    public val __1489691157_Ptr: Pointer?

    public val _1489691157_VtblPtr: Pointer?
      get() = __1489691157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Field(): ContactMatchReasonKind? {
      val fnPtr = _1489691157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactMatchReasonKind>()
      val hr = fn.invokeHR(arrayOf(__1489691157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactMatchReasonKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Segments(): IVectorView<TextSegment?>? {
      val fnPtr = _1489691157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TextSegment?>>()
      val hr = fn.invokeHR(arrayOf(__1489691157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TextSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Text(): String? {
      val fnPtr = _1489691157_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1489691157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactMatchReason_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1489691157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactMatchReason, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc922504e7d8413e95f4b75c54c74077")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactMatchReason(ptr: Pointer?): WithDefault = IContactMatchReason_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactMatchReason {
      val address = segment.toRawLongValue()
      return makeIContactMatchReason(Pointer(address))
    }

    public override fun toNative(obj: IContactMatchReason): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1489691157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactMatchReason): Array<IContactMatchReason?> =
        (elements as
        Array<IContactMatchReason?>).castToImpl<IContactMatchReason,IContactMatchReason_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactMatchReason?> =
        arrayOfNulls<IContactMatchReason_Impl>(size) as Array<IContactMatchReason?>
  }
}
