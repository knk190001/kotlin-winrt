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

@ABIMarker(IMapCustomExperienceFactory.ABI::class)
@Signature("{7a403fb5-a1b1-4e7f-921e-3e6b8d8ebed6}")
@Guid("7a403fb5a1b14e7f921e3e6b8d8ebed6")
@WinRTInterface("7a403fb5a1b14e7f921e3e6b8d8ebed6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapCustomExperienceFactory.ByReference::class)
public interface IMapCustomExperienceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      MapCustomExperience?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapCustomExperienceFactory> {
    public override fun getValue() = ABI.makeIMapCustomExperienceFactory(pointer.getPointer(0))

    public fun setValue(value: IMapCustomExperienceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapCustomExperienceFactory {
    public val __922553828_Ptr: Pointer?

    public val _922553828_VtblPtr: Pointer?
      get() = __922553828_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MapCustomExperience? {
      val fnPtr = _922553828_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCustomExperience>()
      val hr = fn.invokeHR(arrayOf(__922553828_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCustomExperience>(result.getValue())
      return resultValue
    }
  }

  public class IMapCustomExperienceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922553828_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapCustomExperienceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a403fb5a1b14e7f921e3e6b8d8ebed6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapCustomExperienceFactory(ptr: Pointer?): WithDefault =
        IMapCustomExperienceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapCustomExperienceFactory {
      val address = segment.toRawLongValue()
      return makeIMapCustomExperienceFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapCustomExperienceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922553828_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapCustomExperienceFactory):
        Array<IMapCustomExperienceFactory?> = (elements as
        Array<IMapCustomExperienceFactory?>).castToImpl<IMapCustomExperienceFactory,IMapCustomExperienceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapCustomExperienceFactory?> =
        arrayOfNulls<IMapCustomExperienceFactory_Impl>(size) as Array<IMapCustomExperienceFactory?>
  }
}
