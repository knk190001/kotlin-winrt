package Windows.Media.Import

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportStorageMedium.ABI::class)
@Signature("{f2b9b093-fc85-487f-87c2-58d675d05b07}")
@Guid("f2b9b093fc85487f87c258d675d05b07")
@WinRTInterface("f2b9b093fc85487f87c258d675d05b07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportStorageMedium.ByReference::class)
public interface IPhotoImportStorageMedium : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Description(): String?

  @InterfaceMethod(2)
  public fun get_SerialNumber(): String?

  @InterfaceMethod(3)
  public fun get_StorageMediumType(): PhotoImportStorageMediumType?

  @InterfaceMethod(4)
  public fun get_SupportedAccessMode(): PhotoImportAccessMode?

  @InterfaceMethod(5)
  public fun get_CapacityInBytes(): WinDef.ULONG

  @InterfaceMethod(6)
  public fun get_AvailableSpaceInBytes(): WinDef.ULONG

  @InterfaceMethod(7)
  public fun Refresh(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportStorageMedium> {
    public override fun getValue() = ABI.makeIPhotoImportStorageMedium(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportStorageMedium_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportStorageMedium {
    public val __768874904_Ptr: Pointer?

    public val _768874904_VtblPtr: Pointer?
      get() = __768874904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _768874904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Description(): String? {
      val fnPtr = _768874904_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SerialNumber(): String? {
      val fnPtr = _768874904_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_StorageMediumType(): PhotoImportStorageMediumType? {
      val fnPtr = _768874904_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportStorageMediumType>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportStorageMediumType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SupportedAccessMode(): PhotoImportAccessMode? {
      val fnPtr = _768874904_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportAccessMode>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportAccessMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CapacityInBytes(): WinDef.ULONG {
      val fnPtr = _768874904_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_AvailableSpaceInBytes(): WinDef.ULONG {
      val fnPtr = _768874904_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun Refresh(): Unit {
      val fnPtr = _768874904_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__768874904_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhotoImportStorageMedium_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __768874904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportStorageMedium, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2b9b093fc85487f87c258d675d05b07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportStorageMedium(ptr: Pointer?): WithDefault =
        IPhotoImportStorageMedium_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportStorageMedium {
      val address = segment.toRawLongValue()
      return makeIPhotoImportStorageMedium(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportStorageMedium): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__768874904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportStorageMedium):
        Array<IPhotoImportStorageMedium?> = (elements as
        Array<IPhotoImportStorageMedium?>).castToImpl<IPhotoImportStorageMedium,IPhotoImportStorageMedium_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportStorageMedium?> =
        arrayOfNulls<IPhotoImportStorageMedium_Impl>(size) as Array<IPhotoImportStorageMedium?>
  }
}
