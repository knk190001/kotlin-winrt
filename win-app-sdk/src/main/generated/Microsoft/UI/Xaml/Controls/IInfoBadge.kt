package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IInfoBadge.ABI::class)
@Signature("{82104d7f-03d4-5ea4-872e-f9ecab758601}")
@Guid("82104d7f03d45ea4872ef9ecab758601")
@WinRTInterface("82104d7f03d45ea4872ef9ecab758601")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBadge.ByReference::class)
public interface IInfoBadge : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): Int

  @InterfaceMethod(1)
  public fun put_Value(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_IconSource(): IconSource?

  @InterfaceMethod(3)
  public fun put_IconSource(value: IconSource?): Unit

  @InterfaceMethod(4)
  public fun get_TemplateSettings(): InfoBadgeTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInfoBadge> {
    public override fun getValue() = ABI.makeIInfoBadge(pointer.getPointer(0))

    public fun setValue(value: IInfoBadge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBadge {
    public val __621659566_Ptr: Pointer?

    public val _621659566_VtblPtr: Pointer?
      get() = __621659566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): Int {
      val fnPtr = _621659566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__621659566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: Int): Unit {
      val fnPtr = _621659566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__621659566_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IconSource(): IconSource? {
      val fnPtr = _621659566_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__621659566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_IconSource(value: IconSource?): Unit {
      val fnPtr = _621659566_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__621659566_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TemplateSettings(): InfoBadgeTemplateSettings? {
      val fnPtr = _621659566_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBadgeTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__621659566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBadgeTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBadge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __621659566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBadge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82104d7f03d45ea4872ef9ecab758601")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBadge(ptr: Pointer?): WithDefault = IInfoBadge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBadge {
      val address = segment.toRawLongValue()
      return makeIInfoBadge(Pointer(address))
    }

    public override fun toNative(obj: IInfoBadge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__621659566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBadge): Array<IInfoBadge?> = (elements as
        Array<IInfoBadge?>).castToImpl<IInfoBadge,IInfoBadge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBadge?> = arrayOfNulls<IInfoBadge_Impl>(size)
        as Array<IInfoBadge?>
  }
}
