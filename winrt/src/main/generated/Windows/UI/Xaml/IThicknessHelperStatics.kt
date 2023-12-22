package Windows.UI.Xaml

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

@ABIMarker(IThicknessHelperStatics.ABI::class)
@Signature("{c0991a7c-070c-4da6-8784-01ca800eb73a}")
@Guid("c0991a7c070c4da6878401ca800eb73a")
@WinRTInterface("c0991a7c070c4da6878401ca800eb73a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThicknessHelperStatics.ByReference::class)
public interface IThicknessHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromLengths(
    left: Double,
    top: Double,
    right: Double,
    bottom: Double
  ): Thickness?

  @InterfaceMethod(1)
  public fun FromUniformLength(uniformLength: Double): Thickness?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThicknessHelperStatics> {
    public override fun getValue() = ABI.makeIThicknessHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IThicknessHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThicknessHelperStatics {
    public val __1803257355_Ptr: Pointer?

    public val _1803257355_VtblPtr: Pointer?
      get() = __1803257355_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromLengths(
      left: Double,
      top: Double,
      right: Double,
      bottom: Double
    ): Thickness? {
      val fnPtr = _1803257355_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1803257355_Ptr, left, top, right, bottom, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromUniformLength(uniformLength: Double): Thickness? {
      val fnPtr = _1803257355_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1803257355_Ptr, uniformLength, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }
  }

  public class IThicknessHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1803257355_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThicknessHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0991a7c070c4da6878401ca800eb73a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThicknessHelperStatics(ptr: Pointer?): WithDefault =
        IThicknessHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThicknessHelperStatics {
      val address = segment.toRawLongValue()
      return makeIThicknessHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IThicknessHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1803257355_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThicknessHelperStatics): Array<IThicknessHelperStatics?>
        = (elements as
        Array<IThicknessHelperStatics?>).castToImpl<IThicknessHelperStatics,IThicknessHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThicknessHelperStatics?> =
        arrayOfNulls<IThicknessHelperStatics_Impl>(size) as Array<IThicknessHelperStatics?>
  }
}
