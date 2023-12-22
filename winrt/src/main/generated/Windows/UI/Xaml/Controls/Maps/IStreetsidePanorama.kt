package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
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

@ABIMarker(IStreetsidePanorama.ABI::class)
@Signature("{6fe00fd8-ad60-4664-b539-b1069f16c5af}")
@Guid("6fe00fd8ad604664b539b1069f16c5af")
@WinRTInterface("6fe00fd8ad604664b539b1069f16c5af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreetsidePanorama.ByReference::class)
public interface IStreetsidePanorama : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Location(): Geopoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreetsidePanorama> {
    public override fun getValue() = ABI.makeIStreetsidePanorama(pointer.getPointer(0))

    public fun setValue(value: IStreetsidePanorama_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreetsidePanorama {
    public val __649068416_Ptr: Pointer?

    public val _649068416_VtblPtr: Pointer?
      get() = __649068416_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _649068416_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__649068416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }
  }

  public class IStreetsidePanorama_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649068416_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreetsidePanorama, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fe00fd8ad604664b539b1069f16c5af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreetsidePanorama(ptr: Pointer?): WithDefault = IStreetsidePanorama_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreetsidePanorama {
      val address = segment.toRawLongValue()
      return makeIStreetsidePanorama(Pointer(address))
    }

    public override fun toNative(obj: IStreetsidePanorama): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649068416_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreetsidePanorama): Array<IStreetsidePanorama?> =
        (elements as
        Array<IStreetsidePanorama?>).castToImpl<IStreetsidePanorama,IStreetsidePanorama_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreetsidePanorama?> =
        arrayOfNulls<IStreetsidePanorama_Impl>(size) as Array<IStreetsidePanorama?>
  }
}
