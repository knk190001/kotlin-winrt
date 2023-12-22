package Windows.ApplicationModel.Store.Preview

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreConfigurationStatics.ABI::class)
@Signature("{728f7fc0-8628-42ec-84a2-07780eb44d8b}")
@Guid("728f7fc0862842ec84a207780eb44d8b")
@WinRTInterface("728f7fc0862842ec84a207780eb44d8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreConfigurationStatics.ByReference::class)
public interface IStoreConfigurationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetSystemConfiguration(
    catalogHardwareManufacturerId: String?,
    catalogStoreContentModifierId: String?,
    systemConfigurationExpiration: DateTime?,
    catalogHardwareDescriptor: String?
  ): Unit

  @InterfaceMethod(1)
  public fun SetMobileOperatorConfiguration(
    mobileOperatorId: String?,
    appDownloadLimitInMegabytes: WinDef.UINT,
    updateDownloadLimitInMegabytes: WinDef.UINT
  ): Unit

  @InterfaceMethod(2)
  public fun SetStoreWebAccountId(webAccountId: String?): Unit

  @InterfaceMethod(3)
  public fun IsStoreWebAccountId(webAccountId: String?): Boolean

  @InterfaceMethod(4)
  public fun get_HardwareManufacturerInfo(): StoreHardwareManufacturerInfo?

  @InterfaceMethod(5)
  public fun FilterUnsupportedSystemFeaturesAsync(systemFeatures: IIterable<StoreSystemFeature?>?):
      IAsyncOperation<IVectorView<StoreSystemFeature?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreConfigurationStatics> {
    public override fun getValue() = ABI.makeIStoreConfigurationStatics(pointer.getPointer(0))

    public fun setValue(value: IStoreConfigurationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreConfigurationStatics {
    public val __558679032_Ptr: Pointer?

    public val _558679032_VtblPtr: Pointer?
      get() = __558679032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetSystemConfiguration(
      catalogHardwareManufacturerId: String?,
      catalogStoreContentModifierId: String?,
      systemConfigurationExpiration: DateTime?,
      catalogHardwareDescriptor: String?
    ): Unit {
      val fnPtr = _558679032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__558679032_Ptr, marshalToNative(catalogHardwareManufacturerId),
          marshalToNative(catalogStoreContentModifierId),
          marshalToNative(systemConfigurationExpiration),
          marshalToNative(catalogHardwareDescriptor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetMobileOperatorConfiguration(
      mobileOperatorId: String?,
      appDownloadLimitInMegabytes: WinDef.UINT,
      updateDownloadLimitInMegabytes: WinDef.UINT
    ): Unit {
      val fnPtr = _558679032_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__558679032_Ptr, marshalToNative(mobileOperatorId),
          appDownloadLimitInMegabytes, updateDownloadLimitInMegabytes,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetStoreWebAccountId(webAccountId: String?): Unit {
      val fnPtr = _558679032_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__558679032_Ptr, marshalToNative(webAccountId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun IsStoreWebAccountId(webAccountId: String?): Boolean {
      val fnPtr = _558679032_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558679032_Ptr, marshalToNative(webAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_HardwareManufacturerInfo(): StoreHardwareManufacturerInfo? {
      val fnPtr = _558679032_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreHardwareManufacturerInfo>()
      val hr = fn.invokeHR(arrayOf(__558679032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreHardwareManufacturerInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun FilterUnsupportedSystemFeaturesAsync(systemFeatures: IIterable<StoreSystemFeature?>?):
        IAsyncOperation<IVectorView<StoreSystemFeature?>?>? {
      val fnPtr = _558679032_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StoreSystemFeature?>?>>()
      val hr = fn.invokeHR(arrayOf(__558679032_Ptr, marshalToNative(systemFeatures), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StoreSystemFeature?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreConfigurationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558679032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreConfigurationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("728f7fc0862842ec84a207780eb44d8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreConfigurationStatics(ptr: Pointer?): WithDefault =
        IStoreConfigurationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreConfigurationStatics {
      val address = segment.toRawLongValue()
      return makeIStoreConfigurationStatics(Pointer(address))
    }

    public override fun toNative(obj: IStoreConfigurationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558679032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreConfigurationStatics):
        Array<IStoreConfigurationStatics?> = (elements as
        Array<IStoreConfigurationStatics?>).castToImpl<IStoreConfigurationStatics,IStoreConfigurationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreConfigurationStatics?> =
        arrayOfNulls<IStoreConfigurationStatics_Impl>(size) as Array<IStoreConfigurationStatics?>
  }
}
