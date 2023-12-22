package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapModel3DFactory.ABI::class)
@Signature("{df7f0bcc-580a-498b-939b-0119a9dadb9e}")
@Guid("df7f0bcc580a498b939b0119a9dadb9e")
@WinRTInterface("df7f0bcc580a498b939b0119a9dadb9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapModel3DFactory.ByReference::class)
public interface IMapModel3DFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MapModel3D?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapModel3DFactory> {
    public override fun getValue() = ABI.makeIMapModel3DFactory(pointer.getPointer(0))

    public fun setValue(value: IMapModel3DFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapModel3DFactory {
    public val __1993665637_Ptr: Pointer?

    public val _1993665637_VtblPtr: Pointer?
      get() = __1993665637_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MapModel3D? {
      val fnPtr = _1993665637_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapModel3D>()
      val hr = fn.invokeHR(arrayOf(__1993665637_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapModel3D>(result.getValue())
      return resultValue
    }
  }

  public class IMapModel3DFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1993665637_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapModel3DFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df7f0bcc580a498b939b0119a9dadb9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapModel3DFactory(ptr: Pointer?): WithDefault = IMapModel3DFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapModel3DFactory {
      val address = segment.toRawLongValue()
      return makeIMapModel3DFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapModel3DFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1993665637_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapModel3DFactory): Array<IMapModel3DFactory?> =
        (elements as
        Array<IMapModel3DFactory?>).castToImpl<IMapModel3DFactory,IMapModel3DFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapModel3DFactory?> =
        arrayOfNulls<IMapModel3DFactory_Impl>(size) as Array<IMapModel3DFactory?>
  }
}
