package Windows.Storage

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IApplicationData.ABI::class)
@Signature("{c3da6fb7-b744-4b45-b0b8-223a0938d0dc}")
@Guid("c3da6fb7b7444b45b0b8223a0938d0dc")
@WinRTInterface("c3da6fb7b7444b45b0b8223a0938d0dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationData.ByReference::class)
public interface IApplicationData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Version(): WinDef.UINT

  @InterfaceMethod(1)
  public fun SetVersionAsync(desiredVersion: WinDef.UINT,
      handler: ApplicationDataSetVersionHandler?): IAsyncAction?

  @InterfaceMethod(2)
  public fun ClearAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ClearAsync(locality: ApplicationDataLocality?): IAsyncAction?

  @InterfaceMethod(4)
  public fun get_LocalSettings(): ApplicationDataContainer?

  @InterfaceMethod(5)
  public fun get_RoamingSettings(): ApplicationDataContainer?

  @InterfaceMethod(6)
  public fun get_LocalFolder(): StorageFolder?

  @InterfaceMethod(7)
  public fun get_RoamingFolder(): StorageFolder?

  @InterfaceMethod(8)
  public fun get_TemporaryFolder(): StorageFolder?

  @InterfaceMethod(9)
  public fun add_DataChanged(handler: TypedEventHandler<ApplicationData?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_DataChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun SignalDataChanged(): Unit

  @InterfaceMethod(12)
  public fun get_RoamingStorageQuota(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationData> {
    public override fun getValue() = ABI.makeIApplicationData(pointer.getPointer(0))

    public fun setValue(value: IApplicationData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationData {
    public val __684544159_Ptr: Pointer?

    public val _684544159_VtblPtr: Pointer?
      get() = __684544159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Version(): WinDef.UINT {
      val fnPtr = _684544159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun SetVersionAsync(desiredVersion: WinDef.UINT,
        handler: ApplicationDataSetVersionHandler?): IAsyncAction? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr, desiredVersion, marshalToNative(handler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClearAsync(): IAsyncAction? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ClearAsync(locality: ApplicationDataLocality?): IAsyncAction? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr, marshalToNative(locality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_LocalSettings(): ApplicationDataContainer? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationDataContainer>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationDataContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RoamingSettings(): ApplicationDataContainer? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationDataContainer>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationDataContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_LocalFolder(): StorageFolder? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_RoamingFolder(): StorageFolder? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TemporaryFolder(): StorageFolder? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_DataChanged(handler: TypedEventHandler<ApplicationData?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _684544159_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_DataChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _684544159_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SignalDataChanged(): Unit {
      val fnPtr = _684544159_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_RoamingStorageQuota(): WinDef.ULONG {
      val fnPtr = _684544159_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__684544159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __684544159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3da6fb7b7444b45b0b8223a0938d0dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationData(ptr: Pointer?): WithDefault = IApplicationData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationData {
      val address = segment.toRawLongValue()
      return makeIApplicationData(Pointer(address))
    }

    public override fun toNative(obj: IApplicationData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__684544159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationData): Array<IApplicationData?> = (elements as
        Array<IApplicationData?>).castToImpl<IApplicationData,IApplicationData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationData?> =
        arrayOfNulls<IApplicationData_Impl>(size) as Array<IApplicationData?>
  }
}
