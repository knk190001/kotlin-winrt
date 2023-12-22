package Windows.UI.StartScreen

import Windows.System.User
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

@ABIMarker(IStartScreenManagerStatics.ABI::class)
@Signature("{7865ef0f-b585-464e-8993-34e8f8738d48}")
@Guid("7865ef0fb585464e899334e8f8738d48")
@WinRTInterface("7865ef0fb585464e899334e8f8738d48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStartScreenManagerStatics.ByReference::class)
public interface IStartScreenManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): StartScreenManager?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): StartScreenManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStartScreenManagerStatics> {
    public override fun getValue() = ABI.makeIStartScreenManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IStartScreenManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStartScreenManagerStatics {
    public val __78942404_Ptr: Pointer?

    public val _78942404_VtblPtr: Pointer?
      get() = __78942404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): StartScreenManager? {
      val fnPtr = _78942404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StartScreenManager>()
      val hr = fn.invokeHR(arrayOf(__78942404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StartScreenManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): StartScreenManager? {
      val fnPtr = _78942404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StartScreenManager>()
      val hr = fn.invokeHR(arrayOf(__78942404_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StartScreenManager>(result.getValue())
      return resultValue
    }
  }

  public class IStartScreenManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __78942404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStartScreenManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7865ef0fb585464e899334e8f8738d48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStartScreenManagerStatics(ptr: Pointer?): WithDefault =
        IStartScreenManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStartScreenManagerStatics {
      val address = segment.toRawLongValue()
      return makeIStartScreenManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IStartScreenManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__78942404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStartScreenManagerStatics):
        Array<IStartScreenManagerStatics?> = (elements as
        Array<IStartScreenManagerStatics?>).castToImpl<IStartScreenManagerStatics,IStartScreenManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStartScreenManagerStatics?> =
        arrayOfNulls<IStartScreenManagerStatics_Impl>(size) as Array<IStartScreenManagerStatics?>
  }
}
