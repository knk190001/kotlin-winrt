package Windows.Storage.Provider

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
import Windows.Storage.IStorageFolder
import Windows.Storage.Streams.IBuffer
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderSyncRootInfo.ABI::class)
@Signature("{7c1305c4-99f9-41ac-8904-ab055d654926}")
@Guid("7c1305c499f941ac8904ab055d654926")
@WinRTInterface("7c1305c499f941ac8904ab055d654926")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderSyncRootInfo.ByReference::class)
public interface IStorageProviderSyncRootInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Context(): IBuffer?

  @InterfaceMethod(3)
  public fun put_Context(value: IBuffer?): Unit

  @InterfaceMethod(4)
  public fun get_Path(): IStorageFolder?

  @InterfaceMethod(5)
  public fun put_Path(value: IStorageFolder?): Unit

  @InterfaceMethod(6)
  public fun get_DisplayNameResource(): String?

  @InterfaceMethod(7)
  public fun put_DisplayNameResource(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_IconResource(): String?

  @InterfaceMethod(9)
  public fun put_IconResource(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_HydrationPolicy(): StorageProviderHydrationPolicy?

  @InterfaceMethod(11)
  public fun put_HydrationPolicy(value: StorageProviderHydrationPolicy?): Unit

  @InterfaceMethod(12)
  public fun get_HydrationPolicyModifier(): StorageProviderHydrationPolicyModifier?

  @InterfaceMethod(13)
  public fun put_HydrationPolicyModifier(value: StorageProviderHydrationPolicyModifier?): Unit

  @InterfaceMethod(14)
  public fun get_PopulationPolicy(): StorageProviderPopulationPolicy?

  @InterfaceMethod(15)
  public fun put_PopulationPolicy(value: StorageProviderPopulationPolicy?): Unit

  @InterfaceMethod(16)
  public fun get_InSyncPolicy(): StorageProviderInSyncPolicy?

  @InterfaceMethod(17)
  public fun put_InSyncPolicy(value: StorageProviderInSyncPolicy?): Unit

  @InterfaceMethod(18)
  public fun get_HardlinkPolicy(): StorageProviderHardlinkPolicy?

  @InterfaceMethod(19)
  public fun put_HardlinkPolicy(value: StorageProviderHardlinkPolicy?): Unit

  @InterfaceMethod(20)
  public fun get_ShowSiblingsAsGroup(): Boolean

  @InterfaceMethod(21)
  public fun put_ShowSiblingsAsGroup(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_Version(): String?

  @InterfaceMethod(23)
  public fun put_Version(value: String?): Unit

  @InterfaceMethod(24)
  public fun get_ProtectionMode(): StorageProviderProtectionMode?

  @InterfaceMethod(25)
  public fun put_ProtectionMode(value: StorageProviderProtectionMode?): Unit

  @InterfaceMethod(26)
  public fun get_AllowPinning(): Boolean

  @InterfaceMethod(27)
  public fun put_AllowPinning(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_StorageProviderItemPropertyDefinitions():
      IVector<StorageProviderItemPropertyDefinition?>?

  @InterfaceMethod(29)
  public fun get_RecycleBinUri(): Uri?

  @InterfaceMethod(30)
  public fun put_RecycleBinUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderSyncRootInfo> {
    public override fun getValue() = ABI.makeIStorageProviderSyncRootInfo(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderSyncRootInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderSyncRootInfo {
    public val __274897405_Ptr: Pointer?

    public val _274897405_VtblPtr: Pointer?
      get() = __274897405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Context(): IBuffer? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Context(value: IBuffer?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Path(): IStorageFolder? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFolder>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Path(value: IStorageFolder?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DisplayNameResource(): String? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DisplayNameResource(value: String?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IconResource(): String? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_IconResource(value: String?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_HydrationPolicy(): StorageProviderHydrationPolicy? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderHydrationPolicy>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderHydrationPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_HydrationPolicy(value: StorageProviderHydrationPolicy?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_HydrationPolicyModifier(): StorageProviderHydrationPolicyModifier? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderHydrationPolicyModifier>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderHydrationPolicyModifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_HydrationPolicyModifier(value: StorageProviderHydrationPolicyModifier?):
        Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PopulationPolicy(): StorageProviderPopulationPolicy? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderPopulationPolicy>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderPopulationPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PopulationPolicy(value: StorageProviderPopulationPolicy?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_InSyncPolicy(): StorageProviderInSyncPolicy? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderInSyncPolicy>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderInSyncPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_InSyncPolicy(value: StorageProviderInSyncPolicy?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_HardlinkPolicy(): StorageProviderHardlinkPolicy? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderHardlinkPolicy>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderHardlinkPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_HardlinkPolicy(value: StorageProviderHardlinkPolicy?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ShowSiblingsAsGroup(): Boolean {
      val fnPtr = _274897405_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_ShowSiblingsAsGroup(value: Boolean): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Version(): String? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Version(value: String?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_ProtectionMode(): StorageProviderProtectionMode? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderProtectionMode>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderProtectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_ProtectionMode(value: StorageProviderProtectionMode?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_AllowPinning(): Boolean {
      val fnPtr = _274897405_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_AllowPinning(value: Boolean): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_StorageProviderItemPropertyDefinitions():
        IVector<StorageProviderItemPropertyDefinition?>? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<StorageProviderItemPropertyDefinition?>>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<StorageProviderItemPropertyDefinition?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_RecycleBinUri(): Uri? {
      val fnPtr = _274897405_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun put_RecycleBinUri(value: Uri?): Unit {
      val fnPtr = _274897405_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__274897405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderSyncRootInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __274897405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderSyncRootInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c1305c499f941ac8904ab055d654926")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderSyncRootInfo(ptr: Pointer?): WithDefault =
        IStorageProviderSyncRootInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderSyncRootInfo {
      val address = segment.toRawLongValue()
      return makeIStorageProviderSyncRootInfo(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderSyncRootInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__274897405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderSyncRootInfo):
        Array<IStorageProviderSyncRootInfo?> = (elements as
        Array<IStorageProviderSyncRootInfo?>).castToImpl<IStorageProviderSyncRootInfo,IStorageProviderSyncRootInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderSyncRootInfo?> =
        arrayOfNulls<IStorageProviderSyncRootInfo_Impl>(size) as
        Array<IStorageProviderSyncRootInfo?>
  }
}
