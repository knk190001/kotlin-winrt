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

@ABIMarker(IMapElementFactory.ABI::class)
@Signature("{4a30d007-0bd6-47a5-860b-7e7cf5f0c573}")
@Guid("4a30d0070bd647a5860b7e7cf5f0c573")
@WinRTInterface("4a30d0070bd647a5860b7e7cf5f0c573")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementFactory.ByReference::class)
public interface IMapElementFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MapElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementFactory> {
    public override fun getValue() = ABI.makeIMapElementFactory(pointer.getPointer(0))

    public fun setValue(value: IMapElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementFactory {
    public val __1434899897_Ptr: Pointer?

    public val _1434899897_VtblPtr: Pointer?
      get() = __1434899897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MapElement? {
      val fnPtr = _1434899897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapElement>()
      val hr = fn.invokeHR(arrayOf(__1434899897_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapElement>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1434899897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a30d0070bd647a5860b7e7cf5f0c573")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementFactory(ptr: Pointer?): WithDefault = IMapElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementFactory {
      val address = segment.toRawLongValue()
      return makeIMapElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1434899897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementFactory): Array<IMapElementFactory?> =
        (elements as
        Array<IMapElementFactory?>).castToImpl<IMapElementFactory,IMapElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementFactory?> =
        arrayOfNulls<IMapElementFactory_Impl>(size) as Array<IMapElementFactory?>
  }
}
