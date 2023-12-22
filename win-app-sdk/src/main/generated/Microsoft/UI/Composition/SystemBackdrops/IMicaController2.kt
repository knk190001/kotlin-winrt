package Microsoft.UI.Composition.SystemBackdrops

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

@ABIMarker(IMicaController2.ABI::class)
@Signature("{f1ed4a52-d9ca-506e-9586-caaefd3aa971}")
@Guid("f1ed4a52d9ca506e9586caaefd3aa971")
@WinRTInterface("f1ed4a52d9ca506e9586caaefd3aa971")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicaController2.ByReference::class)
public interface IMicaController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): MicaKind?

  @InterfaceMethod(1)
  public fun put_Kind(value: MicaKind?): Unit

  @InterfaceMethod(2)
  public fun ResetProperties(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicaController2> {
    public override fun getValue() = ABI.makeIMicaController2(pointer.getPointer(0))

    public fun setValue(value: IMicaController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicaController2 {
    public val __1837843171_Ptr: Pointer?

    public val _1837843171_VtblPtr: Pointer?
      get() = __1837843171_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): MicaKind? {
      val fnPtr = _1837843171_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicaKind>()
      val hr = fn.invokeHR(arrayOf(__1837843171_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MicaKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Kind(value: MicaKind?): Unit {
      val fnPtr = _1837843171_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1837843171_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ResetProperties(): Unit {
      val fnPtr = _1837843171_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1837843171_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMicaController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1837843171_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicaController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1ed4a52d9ca506e9586caaefd3aa971")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicaController2(ptr: Pointer?): WithDefault = IMicaController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMicaController2 {
      val address = segment.toRawLongValue()
      return makeIMicaController2(Pointer(address))
    }

    public override fun toNative(obj: IMicaController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1837843171_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicaController2): Array<IMicaController2?> = (elements as
        Array<IMicaController2?>).castToImpl<IMicaController2,IMicaController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicaController2?> =
        arrayOfNulls<IMicaController2_Impl>(size) as Array<IMicaController2?>
  }
}
