package Windows.Phone.ApplicationModel

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

@ABIMarker(IApplicationProfileStatics.ABI::class)
@Signature("{d5008ab4-7e7a-11e1-a7f2-b0a14824019b}")
@Guid("d5008ab47e7a11e1a7f2b0a14824019b")
@WinRTInterface("d5008ab47e7a11e1a7f2b0a14824019b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationProfileStatics.ByReference::class)
public interface IApplicationProfileStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Modes(): ApplicationProfileModes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationProfileStatics> {
    public override fun getValue() = ABI.makeIApplicationProfileStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationProfileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationProfileStatics {
    public val __1216480665_Ptr: Pointer?

    public val _1216480665_VtblPtr: Pointer?
      get() = __1216480665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Modes(): ApplicationProfileModes? {
      val fnPtr = _1216480665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationProfileModes>()
      val hr = fn.invokeHR(arrayOf(__1216480665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationProfileModes>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationProfileStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216480665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationProfileStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5008ab47e7a11e1a7f2b0a14824019b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationProfileStatics(ptr: Pointer?): WithDefault =
        IApplicationProfileStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationProfileStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationProfileStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationProfileStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216480665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationProfileStatics):
        Array<IApplicationProfileStatics?> = (elements as
        Array<IApplicationProfileStatics?>).castToImpl<IApplicationProfileStatics,IApplicationProfileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationProfileStatics?> =
        arrayOfNulls<IApplicationProfileStatics_Impl>(size) as Array<IApplicationProfileStatics?>
  }
}
