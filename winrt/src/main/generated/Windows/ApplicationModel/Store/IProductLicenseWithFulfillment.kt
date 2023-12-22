package Windows.ApplicationModel.Store

import Windows.ApplicationModel.Store.IProductLicense.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IProductLicenseWithFulfillment.ABI::class)
@Signature("{fc535c8a-f667-40f3-ba3c-045a63abb3ac}")
@Guid("fc535c8af66740f3ba3c045a63abb3ac")
@WinRTInterface("fc535c8af66740f3ba3c045a63abb3ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProductLicenseWithFulfillment.ByReference::class)
public interface IProductLicenseWithFulfillment : NativeMapped, IWinRTInterface, IProductLicense {
  @InterfaceMethod(0)
  public fun get_IsConsumable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProductLicenseWithFulfillment> {
    public override fun getValue() = ABI.makeIProductLicenseWithFulfillment(pointer.getPointer(0))

    public fun setValue(value: IProductLicenseWithFulfillment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProductLicenseWithFulfillment, IProductLicense.WithDefault {
    public val __1751256788_Ptr: Pointer?

    public val _1751256788_VtblPtr: Pointer?
      get() = __1751256788_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsConsumable(): Boolean {
      val fnPtr = _1751256788_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1751256788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IProductLicenseWithFulfillment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IProductLicense {
    public override val __1232561724_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1751256788_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1751256788_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProductLicenseWithFulfillment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc535c8af66740f3ba3c045a63abb3ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProductLicenseWithFulfillment(ptr: Pointer?): WithDefault =
        IProductLicenseWithFulfillment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProductLicenseWithFulfillment {
      val address = segment.toRawLongValue()
      return makeIProductLicenseWithFulfillment(Pointer(address))
    }

    public override fun toNative(obj: IProductLicenseWithFulfillment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1751256788_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProductLicenseWithFulfillment):
        Array<IProductLicenseWithFulfillment?> = (elements as
        Array<IProductLicenseWithFulfillment?>).castToImpl<IProductLicenseWithFulfillment,IProductLicenseWithFulfillment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProductLicenseWithFulfillment?> =
        arrayOfNulls<IProductLicenseWithFulfillment_Impl>(size) as
        Array<IProductLicenseWithFulfillment?>
  }
}
