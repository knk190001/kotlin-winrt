package Windows.ApplicationModel.Search

import Windows.Foundation.Collections.IVector
import Windows.Storage.StorageFolder
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

@ABIMarker(ILocalContentSuggestionSettings.ABI::class)
@Signature("{eeaeb062-743d-456e-84a3-23f06f2d15d7}")
@Guid("eeaeb062743d456e84a323f06f2d15d7")
@WinRTInterface("eeaeb062743d456e84a323f06f2d15d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalContentSuggestionSettings.ByReference::class)
public interface ILocalContentSuggestionSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Enabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(2)
  public fun get_Locations(): IVector<StorageFolder?>?

  @InterfaceMethod(3)
  public fun put_AqsFilter(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_AqsFilter(): String?

  @InterfaceMethod(5)
  public fun get_PropertiesToMatch(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalContentSuggestionSettings> {
    public override fun getValue() = ABI.makeILocalContentSuggestionSettings(pointer.getPointer(0))

    public fun setValue(value: ILocalContentSuggestionSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalContentSuggestionSettings {
    public val __75530516_Ptr: Pointer?

    public val _75530516_VtblPtr: Pointer?
      get() = __75530516_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Enabled(value: Boolean): Unit {
      val fnPtr = _75530516_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__75530516_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _75530516_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__75530516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Locations(): IVector<StorageFolder?>? {
      val fnPtr = _75530516_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__75530516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AqsFilter(value: String?): Unit {
      val fnPtr = _75530516_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__75530516_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AqsFilter(): String? {
      val fnPtr = _75530516_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__75530516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PropertiesToMatch(): IVector<String?>? {
      val fnPtr = _75530516_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__75530516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ILocalContentSuggestionSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __75530516_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalContentSuggestionSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eeaeb062743d456e84a323f06f2d15d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalContentSuggestionSettings(ptr: Pointer?): WithDefault =
        ILocalContentSuggestionSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalContentSuggestionSettings {
      val address = segment.toRawLongValue()
      return makeILocalContentSuggestionSettings(Pointer(address))
    }

    public override fun toNative(obj: ILocalContentSuggestionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__75530516_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalContentSuggestionSettings):
        Array<ILocalContentSuggestionSettings?> = (elements as
        Array<ILocalContentSuggestionSettings?>).castToImpl<ILocalContentSuggestionSettings,ILocalContentSuggestionSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalContentSuggestionSettings?> =
        arrayOfNulls<ILocalContentSuggestionSettings_Impl>(size) as
        Array<ILocalContentSuggestionSettings?>
  }
}
