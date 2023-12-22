package Microsoft.UI.Input.Experimental

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpFocusControllerStatics.ABI::class)
@Signature("{f7d9123f-9364-566b-b6f0-19c49ed142b9}")
@Guid("f7d9123f9364566bb6f019c49ed142b9")
@WinRTInterface("f7d9123f9364566bb6f019c49ed142b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusControllerStatics.ByReference::class)
public interface IExpFocusControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForInputSite(inputSite: ExpInputSite?): ExpFocusController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusControllerStatics> {
    public override fun getValue() = ABI.makeIExpFocusControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IExpFocusControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusControllerStatics {
    public val __441742987_Ptr: Pointer?

    public val _441742987_VtblPtr: Pointer?
      get() = __441742987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForInputSite(inputSite: ExpInputSite?): ExpFocusController? {
      val fnPtr = _441742987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusController>()
      val hr = fn.invokeHR(arrayOf(__441742987_Ptr, marshalToNative(inputSite), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusController>(result.getValue())
      return resultValue
    }
  }

  public class IExpFocusControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __441742987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7d9123f9364566bb6f019c49ed142b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusControllerStatics(ptr: Pointer?): WithDefault =
        IExpFocusControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusControllerStatics {
      val address = segment.toRawLongValue()
      return makeIExpFocusControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__441742987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusControllerStatics):
        Array<IExpFocusControllerStatics?> = (elements as
        Array<IExpFocusControllerStatics?>).castToImpl<IExpFocusControllerStatics,IExpFocusControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusControllerStatics?> =
        arrayOfNulls<IExpFocusControllerStatics_Impl>(size) as Array<IExpFocusControllerStatics?>
  }
}
