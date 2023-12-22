package Windows.ApplicationModel.Activation

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

@ABIMarker(IFileSavePickerActivatedEventArgs2.ABI::class)
@Signature("{6b73fe13-2cf2-4d48-8cbc-af67d23f1ce7}")
@Guid("6b73fe132cf24d488cbcaf67d23f1ce7")
@WinRTInterface("6b73fe132cf24d488cbcaf67d23f1ce7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileSavePickerActivatedEventArgs2.ByReference::class)
public interface IFileSavePickerActivatedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CallerPackageFamilyName(): String?

  @InterfaceMethod(1)
  public fun get_EnterpriseId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileSavePickerActivatedEventArgs2> {
    public override fun getValue() =
        ABI.makeIFileSavePickerActivatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IFileSavePickerActivatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileSavePickerActivatedEventArgs2 {
    public val __1016056644_Ptr: Pointer?

    public val _1016056644_VtblPtr: Pointer?
      get() = __1016056644_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallerPackageFamilyName(): String? {
      val fnPtr = _1016056644_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016056644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnterpriseId(): String? {
      val fnPtr = _1016056644_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016056644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IFileSavePickerActivatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016056644_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileSavePickerActivatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b73fe132cf24d488cbcaf67d23f1ce7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileSavePickerActivatedEventArgs2(ptr: Pointer?): WithDefault =
        IFileSavePickerActivatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileSavePickerActivatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIFileSavePickerActivatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IFileSavePickerActivatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016056644_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileSavePickerActivatedEventArgs2):
        Array<IFileSavePickerActivatedEventArgs2?> = (elements as
        Array<IFileSavePickerActivatedEventArgs2?>).castToImpl<IFileSavePickerActivatedEventArgs2,IFileSavePickerActivatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileSavePickerActivatedEventArgs2?> =
        arrayOfNulls<IFileSavePickerActivatedEventArgs2_Impl>(size) as
        Array<IFileSavePickerActivatedEventArgs2?>
  }
}
