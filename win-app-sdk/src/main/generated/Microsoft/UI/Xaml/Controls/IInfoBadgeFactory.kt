package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IInfoBadgeFactory.ABI::class)
@Signature("{fb498205-2de0-5986-8aec-2c46ac235087}")
@Guid("fb4982052de059868aec2c46ac235087")
@WinRTInterface("fb4982052de059868aec2c46ac235087")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBadgeFactory.ByReference::class)
public interface IInfoBadgeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): InfoBadge?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBadgeFactory> {
    public override fun getValue() = ABI.makeIInfoBadgeFactory(pointer.getPointer(0))

    public fun setValue(value: IInfoBadgeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBadgeFactory {
    public val __2029329540_Ptr: Pointer?

    public val _2029329540_VtblPtr: Pointer?
      get() = __2029329540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InfoBadge? {
      val fnPtr = _2029329540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBadge>()
      val hr = fn.invokeHR(arrayOf(__2029329540_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBadge>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBadgeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2029329540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBadgeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb4982052de059868aec2c46ac235087")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBadgeFactory(ptr: Pointer?): WithDefault = IInfoBadgeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBadgeFactory {
      val address = segment.toRawLongValue()
      return makeIInfoBadgeFactory(Pointer(address))
    }

    public override fun toNative(obj: IInfoBadgeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2029329540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBadgeFactory): Array<IInfoBadgeFactory?> = (elements
        as Array<IInfoBadgeFactory?>).castToImpl<IInfoBadgeFactory,IInfoBadgeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBadgeFactory?> =
        arrayOfNulls<IInfoBadgeFactory_Impl>(size) as Array<IInfoBadgeFactory?>
  }
}
