package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.SystemBackdrops.MicaKind
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

@ABIMarker(IMicaBackdrop.ABI::class)
@Signature("{c156a404-3dac-593a-b1f3-7a33c289dc83}")
@Guid("c156a4043dac593ab1f37a33c289dc83")
@WinRTInterface("c156a4043dac593ab1f37a33c289dc83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicaBackdrop.ByReference::class)
public interface IMicaBackdrop : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): MicaKind?

  @InterfaceMethod(1)
  public fun put_Kind(value: MicaKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMicaBackdrop>
      {
    public override fun getValue() = ABI.makeIMicaBackdrop(pointer.getPointer(0))

    public fun setValue(value: IMicaBackdrop_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicaBackdrop {
    public val __1714123743_Ptr: Pointer?

    public val _1714123743_VtblPtr: Pointer?
      get() = __1714123743_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): MicaKind? {
      val fnPtr = _1714123743_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicaKind>()
      val hr = fn.invokeHR(arrayOf(__1714123743_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MicaKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Kind(value: MicaKind?): Unit {
      val fnPtr = _1714123743_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1714123743_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMicaBackdrop_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1714123743_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicaBackdrop, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c156a4043dac593ab1f37a33c289dc83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicaBackdrop(ptr: Pointer?): WithDefault = IMicaBackdrop_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMicaBackdrop {
      val address = segment.toRawLongValue()
      return makeIMicaBackdrop(Pointer(address))
    }

    public override fun toNative(obj: IMicaBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1714123743_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicaBackdrop): Array<IMicaBackdrop?> = (elements as
        Array<IMicaBackdrop?>).castToImpl<IMicaBackdrop,IMicaBackdrop_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicaBackdrop?> =
        arrayOfNulls<IMicaBackdrop_Impl>(size) as Array<IMicaBackdrop?>
  }
}
