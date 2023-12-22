package Windows.UI.StartScreen

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

@ABIMarker(ITileMixedRealityModel2.ABI::class)
@Signature("{439470b2-d7c5-410b-8319-9486a27b6c67}")
@Guid("439470b2d7c5410b83199486a27b6c67")
@WinRTInterface("439470b2d7c5410b83199486a27b6c67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileMixedRealityModel2.ByReference::class)
public interface ITileMixedRealityModel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ActivationBehavior(value: TileMixedRealityModelActivationBehavior?): Unit

  @InterfaceMethod(1)
  public fun get_ActivationBehavior(): TileMixedRealityModelActivationBehavior?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileMixedRealityModel2> {
    public override fun getValue() = ABI.makeITileMixedRealityModel2(pointer.getPointer(0))

    public fun setValue(value: ITileMixedRealityModel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileMixedRealityModel2 {
    public val __606962026_Ptr: Pointer?

    public val _606962026_VtblPtr: Pointer?
      get() = __606962026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ActivationBehavior(value: TileMixedRealityModelActivationBehavior?):
        Unit {
      val fnPtr = _606962026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__606962026_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ActivationBehavior(): TileMixedRealityModelActivationBehavior? {
      val fnPtr = _606962026_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileMixedRealityModelActivationBehavior>()
      val hr = fn.invokeHR(arrayOf(__606962026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<TileMixedRealityModelActivationBehavior>(result.getValue())
      return resultValue
    }
  }

  public class ITileMixedRealityModel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __606962026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileMixedRealityModel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("439470b2d7c5410b83199486a27b6c67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileMixedRealityModel2(ptr: Pointer?): WithDefault =
        ITileMixedRealityModel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileMixedRealityModel2 {
      val address = segment.toRawLongValue()
      return makeITileMixedRealityModel2(Pointer(address))
    }

    public override fun toNative(obj: ITileMixedRealityModel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__606962026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileMixedRealityModel2): Array<ITileMixedRealityModel2?>
        = (elements as
        Array<ITileMixedRealityModel2?>).castToImpl<ITileMixedRealityModel2,ITileMixedRealityModel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileMixedRealityModel2?> =
        arrayOfNulls<ITileMixedRealityModel2_Impl>(size) as Array<ITileMixedRealityModel2?>
  }
}
