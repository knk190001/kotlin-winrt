package Windows.UI.Xaml.Media

import Windows.Foundation.IReference
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAcrylicBrush2.ABI::class)
@Signature("{c9645383-b19e-5ac0-86ff-3d90506dbcda}")
@Guid("c9645383b19e5ac086ff3d90506dbcda")
@WinRTInterface("c9645383b19e5ac086ff3d90506dbcda")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcrylicBrush2.ByReference::class)
public interface IAcrylicBrush2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TintLuminosityOpacity(): IReference<Double>?

  @InterfaceMethod(1)
  public fun put_TintLuminosityOpacity(value: IReference<Double>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAcrylicBrush2>
      {
    public override fun getValue() = ABI.makeIAcrylicBrush2(pointer.getPointer(0))

    public fun setValue(value: IAcrylicBrush2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcrylicBrush2 {
    public val __194504217_Ptr: Pointer?

    public val _194504217_VtblPtr: Pointer?
      get() = __194504217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TintLuminosityOpacity(): IReference<Double>? {
      val fnPtr = _194504217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__194504217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TintLuminosityOpacity(value: IReference<Double>?): Unit {
      val fnPtr = _194504217_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__194504217_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAcrylicBrush2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __194504217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcrylicBrush2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9645383b19e5ac086ff3d90506dbcda")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcrylicBrush2(ptr: Pointer?): WithDefault = IAcrylicBrush2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcrylicBrush2 {
      val address = segment.toRawLongValue()
      return makeIAcrylicBrush2(Pointer(address))
    }

    public override fun toNative(obj: IAcrylicBrush2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__194504217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcrylicBrush2): Array<IAcrylicBrush2?> = (elements as
        Array<IAcrylicBrush2?>).castToImpl<IAcrylicBrush2,IAcrylicBrush2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcrylicBrush2?> =
        arrayOfNulls<IAcrylicBrush2_Impl>(size) as Array<IAcrylicBrush2?>
  }
}
