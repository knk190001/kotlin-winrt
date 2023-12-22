package Windows.Devices.SmartCards

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardCryptogramMaterialPackageCharacteristics.ABI::class)
@Signature("{ffb58e1f-0692-4c47-93cf-34d91f9dcd00}")
@Guid("ffb58e1f06924c4793cf34d91f9dcd00")
@WinRTInterface("ffb58e1f06924c4793cf34d91f9dcd00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramMaterialPackageCharacteristics.ByReference::class)
public interface ISmartCardCryptogramMaterialPackageCharacteristics : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_PackageName(): String?

  @InterfaceMethod(1)
  public fun get_StorageKeyName(): String?

  @InterfaceMethod(2)
  public fun get_DateImported(): DateTime?

  @InterfaceMethod(3)
  public fun get_PackageFormat(): SmartCardCryptogramMaterialPackageFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramMaterialPackageCharacteristics> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramMaterialPackageCharacteristics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramMaterialPackageCharacteristics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramMaterialPackageCharacteristics {
    public val __1754654953_Ptr: Pointer?

    public val _1754654953_VtblPtr: Pointer?
      get() = __1754654953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackageName(): String? {
      val fnPtr = _1754654953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1754654953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StorageKeyName(): String? {
      val fnPtr = _1754654953_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1754654953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DateImported(): DateTime? {
      val fnPtr = _1754654953_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1754654953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PackageFormat(): SmartCardCryptogramMaterialPackageFormat? {
      val fnPtr = _1754654953_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramMaterialPackageFormat>()
      val hr = fn.invokeHR(arrayOf(__1754654953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramMaterialPackageFormat>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramMaterialPackageCharacteristics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1754654953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramMaterialPackageCharacteristics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffb58e1f06924c4793cf34d91f9dcd00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramMaterialPackageCharacteristics(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramMaterialPackageCharacteristics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardCryptogramMaterialPackageCharacteristics {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramMaterialPackageCharacteristics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramMaterialPackageCharacteristics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1754654953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramMaterialPackageCharacteristics):
        Array<ISmartCardCryptogramMaterialPackageCharacteristics?> = (elements as
        Array<ISmartCardCryptogramMaterialPackageCharacteristics?>).castToImpl<ISmartCardCryptogramMaterialPackageCharacteristics,ISmartCardCryptogramMaterialPackageCharacteristics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISmartCardCryptogramMaterialPackageCharacteristics?> =
        arrayOfNulls<ISmartCardCryptogramMaterialPackageCharacteristics_Impl>(size) as
        Array<ISmartCardCryptogramMaterialPackageCharacteristics?>
  }
}
