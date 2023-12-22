package Windows.Graphics.Printing3D

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DBaseMaterialStatics.ABI::class)
@Signature("{815a47bc-374a-476d-be92-3ecfd1cb9776}")
@Guid("815a47bc374a476dbe923ecfd1cb9776")
@WinRTInterface("815a47bc374a476dbe923ecfd1cb9776")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DBaseMaterialStatics.ByReference::class)
public interface IPrinting3DBaseMaterialStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Abs(): String?

  @InterfaceMethod(1)
  public fun get_Pla(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DBaseMaterialStatics> {
    public override fun getValue() = ABI.makeIPrinting3DBaseMaterialStatics(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DBaseMaterialStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DBaseMaterialStatics {
    public val __860964508_Ptr: Pointer?

    public val _860964508_VtblPtr: Pointer?
      get() = __860964508_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Abs(): String? {
      val fnPtr = _860964508_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__860964508_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Pla(): String? {
      val fnPtr = _860964508_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__860964508_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DBaseMaterialStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __860964508_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DBaseMaterialStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("815a47bc374a476dbe923ecfd1cb9776")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DBaseMaterialStatics(ptr: Pointer?): WithDefault =
        IPrinting3DBaseMaterialStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DBaseMaterialStatics {
      val address = segment.toRawLongValue()
      return makeIPrinting3DBaseMaterialStatics(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DBaseMaterialStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__860964508_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DBaseMaterialStatics):
        Array<IPrinting3DBaseMaterialStatics?> = (elements as
        Array<IPrinting3DBaseMaterialStatics?>).castToImpl<IPrinting3DBaseMaterialStatics,IPrinting3DBaseMaterialStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DBaseMaterialStatics?> =
        arrayOfNulls<IPrinting3DBaseMaterialStatics_Impl>(size) as
        Array<IPrinting3DBaseMaterialStatics?>
  }
}
