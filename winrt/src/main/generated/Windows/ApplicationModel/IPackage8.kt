package Windows.ApplicationModel

import Windows.ApplicationModel.Core.AppListEntry
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Size
import Windows.Storage.StorageFolder
import Windows.Storage.Streams.RandomAccessStreamReference
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

@ABIMarker(IPackage8.ABI::class)
@Signature("{2c584f7b-ce2a-4be6-a093-77cfbb2a7ea1}")
@Guid("2c584f7bce2a4be6a09377cfbb2a7ea1")
@WinRTInterface("2c584f7bce2a4be6a09377cfbb2a7ea1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackage8.ByReference::class)
public interface IPackage8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EffectiveExternalLocation(): StorageFolder?

  @InterfaceMethod(1)
  public fun get_MachineExternalLocation(): StorageFolder?

  @InterfaceMethod(2)
  public fun get_UserExternalLocation(): StorageFolder?

  @InterfaceMethod(3)
  public fun get_InstalledPath(): String?

  @InterfaceMethod(4)
  public fun get_MutablePath(): String?

  @InterfaceMethod(5)
  public fun get_EffectivePath(): String?

  @InterfaceMethod(6)
  public fun get_EffectiveExternalPath(): String?

  @InterfaceMethod(7)
  public fun get_MachineExternalPath(): String?

  @InterfaceMethod(8)
  public fun get_UserExternalPath(): String?

  @InterfaceMethod(9)
  public fun GetLogoAsRandomAccessStreamReference(size: Size?): RandomAccessStreamReference?

  @InterfaceMethod(10)
  public fun GetAppListEntries(): IVectorView<AppListEntry?>?

  @InterfaceMethod(11)
  public fun get_IsStub(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPackage8> {
    public override fun getValue() = ABI.makeIPackage8(pointer.getPointer(0))

    public fun setValue(value: IPackage8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackage8 {
    public val __1252479849_Ptr: Pointer?

    public val _1252479849_VtblPtr: Pointer?
      get() = __1252479849_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EffectiveExternalLocation(): StorageFolder? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MachineExternalLocation(): StorageFolder? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UserExternalLocation(): StorageFolder? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_InstalledPath(): String? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MutablePath(): String? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_EffectivePath(): String? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_EffectiveExternalPath(): String? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MachineExternalPath(): String? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_UserExternalPath(): String? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetLogoAsRandomAccessStreamReference(size: Size?):
        RandomAccessStreamReference? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr, marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetAppListEntries(): IVectorView<AppListEntry?>? {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppListEntry?>>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppListEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsStub(): Boolean {
      val fnPtr = _1252479849_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1252479849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPackage8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252479849_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackage8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c584f7bce2a4be6a09377cfbb2a7ea1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackage8(ptr: Pointer?): WithDefault = IPackage8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackage8 {
      val address = segment.toRawLongValue()
      return makeIPackage8(Pointer(address))
    }

    public override fun toNative(obj: IPackage8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252479849_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage8): Array<IPackage8?> = (elements as
        Array<IPackage8?>).castToImpl<IPackage8,IPackage8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage8?> = arrayOfNulls<IPackage8_Impl>(size)
        as Array<IPackage8?>
  }
}
