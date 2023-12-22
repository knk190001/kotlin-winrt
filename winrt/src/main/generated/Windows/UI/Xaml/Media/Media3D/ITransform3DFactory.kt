package Windows.UI.Xaml.Media.Media3D

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

@ABIMarker(ITransform3DFactory.ABI::class)
@Signature("{052c1f7a-8d73-48cd-bbb8-d00434caae5d}")
@Guid("052c1f7a8d7348cdbbb8d00434caae5d")
@WinRTInterface("052c1f7a8d7348cdbbb8d00434caae5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransform3DFactory.ByReference::class)
public interface ITransform3DFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Transform3D?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransform3DFactory> {
    public override fun getValue() = ABI.makeITransform3DFactory(pointer.getPointer(0))

    public fun setValue(value: ITransform3DFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransform3DFactory {
    public val __1854056130_Ptr: Pointer?

    public val _1854056130_VtblPtr: Pointer?
      get() = __1854056130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Transform3D? {
      val fnPtr = _1854056130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform3D>()
      val hr = fn.invokeHR(arrayOf(__1854056130_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform3D>(result.getValue())
      return resultValue
    }
  }

  public class ITransform3DFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1854056130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransform3DFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("052c1f7a8d7348cdbbb8d00434caae5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransform3DFactory(ptr: Pointer?): WithDefault = ITransform3DFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransform3DFactory {
      val address = segment.toRawLongValue()
      return makeITransform3DFactory(Pointer(address))
    }

    public override fun toNative(obj: ITransform3DFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1854056130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransform3DFactory): Array<ITransform3DFactory?> =
        (elements as
        Array<ITransform3DFactory?>).castToImpl<ITransform3DFactory,ITransform3DFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransform3DFactory?> =
        arrayOfNulls<ITransform3DFactory_Impl>(size) as Array<ITransform3DFactory?>
  }
}
