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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DCompositeMaterialGroup2.ABI::class)
@Signature("{06e86d62-7d3b-41e1-944c-bafde4555483}")
@Guid("06e86d627d3b41e1944cbafde4555483")
@WinRTInterface("06e86d627d3b41e1944cbafde4555483")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DCompositeMaterialGroup2.ByReference::class)
public interface IPrinting3DCompositeMaterialGroup2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BaseMaterialGroup(): Printing3DBaseMaterialGroup?

  @InterfaceMethod(1)
  public fun put_BaseMaterialGroup(value: Printing3DBaseMaterialGroup?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DCompositeMaterialGroup2> {
    public override fun getValue() =
        ABI.makeIPrinting3DCompositeMaterialGroup2(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DCompositeMaterialGroup2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DCompositeMaterialGroup2 {
    public val __452845968_Ptr: Pointer?

    public val _452845968_VtblPtr: Pointer?
      get() = __452845968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaseMaterialGroup(): Printing3DBaseMaterialGroup? {
      val fnPtr = _452845968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DBaseMaterialGroup>()
      val hr = fn.invokeHR(arrayOf(__452845968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DBaseMaterialGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BaseMaterialGroup(value: Printing3DBaseMaterialGroup?): Unit {
      val fnPtr = _452845968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452845968_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DCompositeMaterialGroup2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452845968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DCompositeMaterialGroup2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06e86d627d3b41e1944cbafde4555483")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DCompositeMaterialGroup2(ptr: Pointer?): WithDefault =
        IPrinting3DCompositeMaterialGroup2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DCompositeMaterialGroup2 {
      val address = segment.toRawLongValue()
      return makeIPrinting3DCompositeMaterialGroup2(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DCompositeMaterialGroup2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__452845968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DCompositeMaterialGroup2):
        Array<IPrinting3DCompositeMaterialGroup2?> = (elements as
        Array<IPrinting3DCompositeMaterialGroup2?>).castToImpl<IPrinting3DCompositeMaterialGroup2,IPrinting3DCompositeMaterialGroup2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DCompositeMaterialGroup2?> =
        arrayOfNulls<IPrinting3DCompositeMaterialGroup2_Impl>(size) as
        Array<IPrinting3DCompositeMaterialGroup2?>
  }
}
