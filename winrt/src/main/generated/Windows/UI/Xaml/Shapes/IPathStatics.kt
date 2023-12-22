package Windows.UI.Xaml.Shapes

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

@ABIMarker(IPathStatics.ABI::class)
@Signature("{f627e59d-87dc-4142-81f1-97fc7ff8641c}")
@Guid("f627e59d87dc414281f197fc7ff8641c")
@WinRTInterface("f627e59d87dc414281f197fc7ff8641c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathStatics.ByReference::class)
public interface IPathStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathStatics> {
    public override fun getValue() = ABI.makeIPathStatics(pointer.getPointer(0))

    public fun setValue(value: IPathStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathStatics {
    public val __1323372608_Ptr: Pointer?

    public val _1323372608_VtblPtr: Pointer?
      get() = __1323372608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataProperty(): DependencyProperty? {
      val fnPtr = _1323372608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1323372608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPathStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1323372608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f627e59d87dc414281f197fc7ff8641c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathStatics(ptr: Pointer?): WithDefault = IPathStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathStatics {
      val address = segment.toRawLongValue()
      return makeIPathStatics(Pointer(address))
    }

    public override fun toNative(obj: IPathStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1323372608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathStatics): Array<IPathStatics?> = (elements as
        Array<IPathStatics?>).castToImpl<IPathStatics,IPathStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathStatics?> =
        arrayOfNulls<IPathStatics_Impl>(size) as Array<IPathStatics?>
  }
}
