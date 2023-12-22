package Windows.Graphics.Printing3D

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrint3DManagerStatics.ABI::class)
@Signature("{0ef1cafe-a9ad-4c08-a917-1d1f863eabcb}")
@Guid("0ef1cafea9ad4c08a9171d1f863eabcb")
@WinRTInterface("0ef1cafea9ad4c08a9171d1f863eabcb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DManagerStatics.ByReference::class)
public interface IPrint3DManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): Print3DManager?

  @InterfaceMethod(1)
  public fun ShowPrintUIAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DManagerStatics> {
    public override fun getValue() = ABI.makeIPrint3DManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPrint3DManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DManagerStatics {
    public val __1949314037_Ptr: Pointer?

    public val _1949314037_VtblPtr: Pointer?
      get() = __1949314037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): Print3DManager? {
      val fnPtr = _1949314037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DManager>()
      val hr = fn.invokeHR(arrayOf(__1949314037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowPrintUIAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1949314037_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1949314037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1949314037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ef1cafea9ad4c08a9171d1f863eabcb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DManagerStatics(ptr: Pointer?): WithDefault =
        IPrint3DManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPrint3DManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1949314037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DManagerStatics): Array<IPrint3DManagerStatics?> =
        (elements as
        Array<IPrint3DManagerStatics?>).castToImpl<IPrint3DManagerStatics,IPrint3DManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DManagerStatics?> =
        arrayOfNulls<IPrint3DManagerStatics_Impl>(size) as Array<IPrint3DManagerStatics?>
  }
}
