package Windows.Phone.PersonalInformation

import Windows.Foundation.DateTime
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

@ABIMarker(IContactInformation2.ABI::class)
@Signature("{3198b20c-621e-4668-ac38-d667b87d06d5}")
@Guid("3198b20c621e4668ac38d667b87d06d5")
@WinRTInterface("3198b20c621e4668ac38d667b87d06d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactInformation2.ByReference::class)
public interface IContactInformation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayPictureDate(): DateTime?

  @InterfaceMethod(1)
  public fun put_DisplayPictureDate(returnValue: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactInformation2> {
    public override fun getValue() = ABI.makeIContactInformation2(pointer.getPointer(0))

    public fun setValue(value: IContactInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactInformation2 {
    public val __102936194_Ptr: Pointer?

    public val _102936194_VtblPtr: Pointer?
      get() = __102936194_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayPictureDate(): DateTime? {
      val fnPtr = _102936194_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__102936194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayPictureDate(returnValue: DateTime?): Unit {
      val fnPtr = _102936194_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__102936194_Ptr, marshalToNative(returnValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __102936194_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3198b20c621e4668ac38d667b87d06d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactInformation2(ptr: Pointer?): WithDefault = IContactInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactInformation2 {
      val address = segment.toRawLongValue()
      return makeIContactInformation2(Pointer(address))
    }

    public override fun toNative(obj: IContactInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__102936194_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactInformation2): Array<IContactInformation2?> =
        (elements as
        Array<IContactInformation2?>).castToImpl<IContactInformation2,IContactInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactInformation2?> =
        arrayOfNulls<IContactInformation2_Impl>(size) as Array<IContactInformation2?>
  }
}
