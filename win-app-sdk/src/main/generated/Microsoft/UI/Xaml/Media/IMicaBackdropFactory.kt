package Microsoft.UI.Xaml.Media

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMicaBackdropFactory.ABI::class)
@Signature("{774379ce-74bd-59d4-849d-d99c4184d838}")
@Guid("774379ce74bd59d4849dd99c4184d838")
@WinRTInterface("774379ce74bd59d4849dd99c4184d838")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicaBackdropFactory.ByReference::class)
public interface IMicaBackdropFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MicaBackdrop?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicaBackdropFactory> {
    public override fun getValue() = ABI.makeIMicaBackdropFactory(pointer.getPointer(0))

    public fun setValue(value: IMicaBackdropFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicaBackdropFactory {
    public val __442533289_Ptr: Pointer?

    public val _442533289_VtblPtr: Pointer?
      get() = __442533289_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MicaBackdrop? {
      val fnPtr = _442533289_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicaBackdrop>()
      val hr = fn.invokeHR(arrayOf(__442533289_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MicaBackdrop>(result.getValue())
      return resultValue
    }
  }

  public class IMicaBackdropFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __442533289_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicaBackdropFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("774379ce74bd59d4849dd99c4184d838")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicaBackdropFactory(ptr: Pointer?): WithDefault = IMicaBackdropFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMicaBackdropFactory {
      val address = segment.toRawLongValue()
      return makeIMicaBackdropFactory(Pointer(address))
    }

    public override fun toNative(obj: IMicaBackdropFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__442533289_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicaBackdropFactory): Array<IMicaBackdropFactory?> =
        (elements as
        Array<IMicaBackdropFactory?>).castToImpl<IMicaBackdropFactory,IMicaBackdropFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicaBackdropFactory?> =
        arrayOfNulls<IMicaBackdropFactory_Impl>(size) as Array<IMicaBackdropFactory?>
  }
}
