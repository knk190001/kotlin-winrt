package Windows.Devices.Printers

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

@ABIMarker(IIppResolutionFactory.ABI::class)
@Signature("{e481c2ae-251a-5326-b173-95543ed99a35}")
@Guid("e481c2ae251a5326b17395543ed99a35")
@WinRTInterface("e481c2ae251a5326b17395543ed99a35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppResolutionFactory.ByReference::class)
public interface IIppResolutionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    width: Int,
    height: Int,
    unit: IppResolutionUnit?
  ): IppResolution?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppResolutionFactory> {
    public override fun getValue() = ABI.makeIIppResolutionFactory(pointer.getPointer(0))

    public fun setValue(value: IIppResolutionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppResolutionFactory {
    public val __2036111529_Ptr: Pointer?

    public val _2036111529_VtblPtr: Pointer?
      get() = __2036111529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      width: Int,
      height: Int,
      unit: IppResolutionUnit?
    ): IppResolution? {
      val fnPtr = _2036111529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppResolution>()
      val hr = fn.invokeHR(arrayOf(__2036111529_Ptr, width, height, marshalToNative(unit), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppResolution>(result.getValue())
      return resultValue
    }
  }

  public class IIppResolutionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2036111529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppResolutionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e481c2ae251a5326b17395543ed99a35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppResolutionFactory(ptr: Pointer?): WithDefault =
        IIppResolutionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppResolutionFactory {
      val address = segment.toRawLongValue()
      return makeIIppResolutionFactory(Pointer(address))
    }

    public override fun toNative(obj: IIppResolutionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2036111529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppResolutionFactory): Array<IIppResolutionFactory?> =
        (elements as
        Array<IIppResolutionFactory?>).castToImpl<IIppResolutionFactory,IIppResolutionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppResolutionFactory?> =
        arrayOfNulls<IIppResolutionFactory_Impl>(size) as Array<IIppResolutionFactory?>
  }
}
