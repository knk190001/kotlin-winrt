package Windows.ApplicationModel.Contacts

import Windows.Foundation.Rect
import Windows.UI.Popups.Placement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactManagerStatics.ABI::class)
@Signature("{81f21ac0-f661-4708-ba4f-d386bd0d622e}")
@Guid("81f21ac0f6614708ba4fd386bd0d622e")
@WinRTInterface("81f21ac0f6614708ba4fd386bd0d622e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactManagerStatics.ByReference::class)
public interface IContactManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowContactCard(contact: Contact?, selection: Rect?): Unit

  @InterfaceMethod(1)
  public fun ShowContactCard(
    contact: Contact?,
    selection: Rect?,
    preferredPlacement: Placement?
  ): Unit

  @InterfaceMethod(2)
  public fun ShowDelayLoadedContactCard(
    contact: Contact?,
    selection: Rect?,
    preferredPlacement: Placement?
  ): ContactCardDelayedDataLoader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactManagerStatics> {
    public override fun getValue() = ABI.makeIContactManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IContactManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactManagerStatics {
    public val __111224276_Ptr: Pointer?

    public val _111224276_VtblPtr: Pointer?
      get() = __111224276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowContactCard(contact: Contact?, selection: Rect?): Unit {
      val fnPtr = _111224276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__111224276_Ptr, marshalToNative(contact),
          marshalToNative(selection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ShowContactCard(
      contact: Contact?,
      selection: Rect?,
      preferredPlacement: Placement?
    ): Unit {
      val fnPtr = _111224276_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__111224276_Ptr, marshalToNative(contact),
          marshalToNative(selection), marshalToNative(preferredPlacement),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ShowDelayLoadedContactCard(
      contact: Contact?,
      selection: Rect?,
      preferredPlacement: Placement?
    ): ContactCardDelayedDataLoader? {
      val fnPtr = _111224276_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactCardDelayedDataLoader>()
      val hr = fn.invokeHR(arrayOf(__111224276_Ptr, marshalToNative(contact),
          marshalToNative(selection), marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactCardDelayedDataLoader>(result.getValue())
      return resultValue
    }
  }

  public class IContactManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __111224276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81f21ac0f6614708ba4fd386bd0d622e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactManagerStatics(ptr: Pointer?): WithDefault =
        IContactManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactManagerStatics {
      val address = segment.toRawLongValue()
      return makeIContactManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IContactManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__111224276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactManagerStatics): Array<IContactManagerStatics?> =
        (elements as
        Array<IContactManagerStatics?>).castToImpl<IContactManagerStatics,IContactManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactManagerStatics?> =
        arrayOfNulls<IContactManagerStatics_Impl>(size) as Array<IContactManagerStatics?>
  }
}
