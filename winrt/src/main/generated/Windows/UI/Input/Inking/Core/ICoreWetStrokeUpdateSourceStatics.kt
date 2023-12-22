package Windows.UI.Input.Inking.Core

import Windows.UI.Input.Inking.InkPresenter
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

@ABIMarker(ICoreWetStrokeUpdateSourceStatics.ABI::class)
@Signature("{3dad9cba-1d3d-46ae-ab9d-8647486c6f90}")
@Guid("3dad9cba1d3d46aeab9d8647486c6f90")
@WinRTInterface("3dad9cba1d3d46aeab9d8647486c6f90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWetStrokeUpdateSourceStatics.ByReference::class)
public interface ICoreWetStrokeUpdateSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(inkPresenter: InkPresenter?): CoreWetStrokeUpdateSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWetStrokeUpdateSourceStatics> {
    public override fun getValue() =
        ABI.makeICoreWetStrokeUpdateSourceStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreWetStrokeUpdateSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWetStrokeUpdateSourceStatics {
    public val __1378380941_Ptr: Pointer?

    public val _1378380941_VtblPtr: Pointer?
      get() = __1378380941_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(inkPresenter: InkPresenter?): CoreWetStrokeUpdateSource? {
      val fnPtr = _1378380941_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWetStrokeUpdateSource>()
      val hr = fn.invokeHR(arrayOf(__1378380941_Ptr, marshalToNative(inkPresenter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWetStrokeUpdateSource>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWetStrokeUpdateSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1378380941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWetStrokeUpdateSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3dad9cba1d3d46aeab9d8647486c6f90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWetStrokeUpdateSourceStatics(ptr: Pointer?): WithDefault =
        ICoreWetStrokeUpdateSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWetStrokeUpdateSourceStatics {
      val address = segment.toRawLongValue()
      return makeICoreWetStrokeUpdateSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreWetStrokeUpdateSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1378380941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWetStrokeUpdateSourceStatics):
        Array<ICoreWetStrokeUpdateSourceStatics?> = (elements as
        Array<ICoreWetStrokeUpdateSourceStatics?>).castToImpl<ICoreWetStrokeUpdateSourceStatics,ICoreWetStrokeUpdateSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWetStrokeUpdateSourceStatics?> =
        arrayOfNulls<ICoreWetStrokeUpdateSourceStatics_Impl>(size) as
        Array<ICoreWetStrokeUpdateSourceStatics?>
  }
}
