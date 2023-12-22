package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IIconSourceElementStatics.ABI::class)
@Signature("{f37cfd45-f3d8-50ff-a1b8-0fba4ae61d79}")
@Guid("f37cfd45f3d850ffa1b80fba4ae61d79")
@WinRTInterface("f37cfd45f3d850ffa1b80fba4ae61d79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSourceElementStatics.ByReference::class)
public interface IIconSourceElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconSourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconSourceElementStatics> {
    public override fun getValue() = ABI.makeIIconSourceElementStatics(pointer.getPointer(0))

    public fun setValue(value: IIconSourceElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSourceElementStatics {
    public val __1263497127_Ptr: Pointer?

    public val _1263497127_VtblPtr: Pointer?
      get() = __1263497127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _1263497127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1263497127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IIconSourceElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1263497127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSourceElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f37cfd45f3d850ffa1b80fba4ae61d79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSourceElementStatics(ptr: Pointer?): WithDefault =
        IIconSourceElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSourceElementStatics {
      val address = segment.toRawLongValue()
      return makeIIconSourceElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IIconSourceElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1263497127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSourceElementStatics):
        Array<IIconSourceElementStatics?> = (elements as
        Array<IIconSourceElementStatics?>).castToImpl<IIconSourceElementStatics,IIconSourceElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSourceElementStatics?> =
        arrayOfNulls<IIconSourceElementStatics_Impl>(size) as Array<IIconSourceElementStatics?>
  }
}
