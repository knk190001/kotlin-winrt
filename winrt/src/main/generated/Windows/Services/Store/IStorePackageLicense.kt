package Windows.Services.Store

import Windows.ApplicationModel.Package
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IStorePackageLicense.ABI::class)
@Signature("{0c465714-14e1-4973-bd14-f77724271e99}")
@Guid("0c46571414e14973bd14f77724271e99")
@WinRTInterface("0c46571414e14973bd14f77724271e99")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePackageLicense.ByReference::class)
public interface IStorePackageLicense : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun add_LicenseLost(handler: TypedEventHandler<StorePackageLicense?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_LicenseLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_Package(): Package?

  @InterfaceMethod(3)
  public fun get_IsValid(): Boolean

  @InterfaceMethod(4)
  public fun ReleaseLicense(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePackageLicense> {
    public override fun getValue() = ABI.makeIStorePackageLicense(pointer.getPointer(0))

    public fun setValue(value: IStorePackageLicense_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePackageLicense, IClosable.WithDefault {
    public val __714652273_Ptr: Pointer?

    public val _714652273_VtblPtr: Pointer?
      get() = __714652273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_LicenseLost(handler: TypedEventHandler<StorePackageLicense?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _714652273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__714652273_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_LicenseLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _714652273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714652273_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Package(): Package? {
      val fnPtr = _714652273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__714652273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsValid(): Boolean {
      val fnPtr = _714652273_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__714652273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun ReleaseLicense(): Unit {
      val fnPtr = _714652273_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714652273_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorePackageLicense_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_714652273_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __714652273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePackageLicense, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c46571414e14973bd14f77724271e99")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePackageLicense(ptr: Pointer?): WithDefault = IStorePackageLicense_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePackageLicense {
      val address = segment.toRawLongValue()
      return makeIStorePackageLicense(Pointer(address))
    }

    public override fun toNative(obj: IStorePackageLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__714652273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePackageLicense): Array<IStorePackageLicense?> =
        (elements as
        Array<IStorePackageLicense?>).castToImpl<IStorePackageLicense,IStorePackageLicense_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePackageLicense?> =
        arrayOfNulls<IStorePackageLicense_Impl>(size) as Array<IStorePackageLicense?>
  }
}
