package Windows.ApplicationModel.Core

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

@ABIMarker(ICoreImmersiveApplication3.ABI::class)
@Signature("{34a05b2f-ee0d-41e5-8314-cf10c91bf0af}")
@Guid("34a05b2fee0d41e58314cf10c91bf0af")
@WinRTInterface("34a05b2fee0d41e58314cf10c91bf0af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreImmersiveApplication3.ByReference::class)
public interface ICoreImmersiveApplication3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateNewView(viewSource: IFrameworkViewSource?): CoreApplicationView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreImmersiveApplication3> {
    public override fun getValue() = ABI.makeICoreImmersiveApplication3(pointer.getPointer(0))

    public fun setValue(value: ICoreImmersiveApplication3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreImmersiveApplication3 {
    public val __1664730815_Ptr: Pointer?

    public val _1664730815_VtblPtr: Pointer?
      get() = __1664730815_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateNewView(viewSource: IFrameworkViewSource?): CoreApplicationView? {
      val fnPtr = _1664730815_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreApplicationView>()
      val hr = fn.invokeHR(arrayOf(__1664730815_Ptr, marshalToNative(viewSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreApplicationView>(result.getValue())
      return resultValue
    }
  }

  public class ICoreImmersiveApplication3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1664730815_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreImmersiveApplication3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34a05b2fee0d41e58314cf10c91bf0af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreImmersiveApplication3(ptr: Pointer?): WithDefault =
        ICoreImmersiveApplication3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreImmersiveApplication3 {
      val address = segment.toRawLongValue()
      return makeICoreImmersiveApplication3(Pointer(address))
    }

    public override fun toNative(obj: ICoreImmersiveApplication3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1664730815_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreImmersiveApplication3):
        Array<ICoreImmersiveApplication3?> = (elements as
        Array<ICoreImmersiveApplication3?>).castToImpl<ICoreImmersiveApplication3,ICoreImmersiveApplication3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreImmersiveApplication3?> =
        arrayOfNulls<ICoreImmersiveApplication3_Impl>(size) as Array<ICoreImmersiveApplication3?>
  }
}
