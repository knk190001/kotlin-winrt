package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IConnectedAnimation3.ABI::class)
@Signature("{6e3040c6-0430-59c0-a80c-cceed2e778dd}")
@Guid("6e3040c6043059c0a80ccceed2e778dd")
@WinRTInterface("6e3040c6043059c0a80ccceed2e778dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimation3.ByReference::class)
public interface IConnectedAnimation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Configuration(): ConnectedAnimationConfiguration?

  @InterfaceMethod(1)
  public fun put_Configuration(value: ConnectedAnimationConfiguration?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimation3> {
    public override fun getValue() = ABI.makeIConnectedAnimation3(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimation3 {
    public val __1862675794_Ptr: Pointer?

    public val _1862675794_VtblPtr: Pointer?
      get() = __1862675794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): ConnectedAnimationConfiguration? {
      val fnPtr = _1862675794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimationConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1862675794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimationConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Configuration(value: ConnectedAnimationConfiguration?): Unit {
      val fnPtr = _1862675794_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1862675794_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConnectedAnimation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1862675794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e3040c6043059c0a80ccceed2e778dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimation3(ptr: Pointer?): WithDefault = IConnectedAnimation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimation3 {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimation3(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1862675794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimation3): Array<IConnectedAnimation3?> =
        (elements as
        Array<IConnectedAnimation3?>).castToImpl<IConnectedAnimation3,IConnectedAnimation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimation3?> =
        arrayOfNulls<IConnectedAnimation3_Impl>(size) as Array<IConnectedAnimation3?>
  }
}
