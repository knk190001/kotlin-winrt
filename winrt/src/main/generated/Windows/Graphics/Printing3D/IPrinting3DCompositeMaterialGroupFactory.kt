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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPrinting3DCompositeMaterialGroupFactory.ABI::class)
@Signature("{d08ecd13-92ff-43aa-a627-8d43c22c817e}")
@Guid("d08ecd1392ff43aaa6278d43c22c817e")
@WinRTInterface("d08ecd1392ff43aaa6278d43c22c817e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DCompositeMaterialGroupFactory.ByReference::class)
public interface IPrinting3DCompositeMaterialGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(MaterialGroupId: WinDef.UINT): Printing3DCompositeMaterialGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DCompositeMaterialGroupFactory> {
    public override fun getValue() =
        ABI.makeIPrinting3DCompositeMaterialGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DCompositeMaterialGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DCompositeMaterialGroupFactory {
    public val __301902792_Ptr: Pointer?

    public val _301902792_VtblPtr: Pointer?
      get() = __301902792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(MaterialGroupId: WinDef.UINT): Printing3DCompositeMaterialGroup? {
      val fnPtr = _301902792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DCompositeMaterialGroup>()
      val hr = fn.invokeHR(arrayOf(__301902792_Ptr, MaterialGroupId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DCompositeMaterialGroup>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DCompositeMaterialGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __301902792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DCompositeMaterialGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d08ecd1392ff43aaa6278d43c22c817e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DCompositeMaterialGroupFactory(ptr: Pointer?): WithDefault =
        IPrinting3DCompositeMaterialGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrinting3DCompositeMaterialGroupFactory {
      val address = segment.toRawLongValue()
      return makeIPrinting3DCompositeMaterialGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DCompositeMaterialGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__301902792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DCompositeMaterialGroupFactory):
        Array<IPrinting3DCompositeMaterialGroupFactory?> = (elements as
        Array<IPrinting3DCompositeMaterialGroupFactory?>).castToImpl<IPrinting3DCompositeMaterialGroupFactory,IPrinting3DCompositeMaterialGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DCompositeMaterialGroupFactory?> =
        arrayOfNulls<IPrinting3DCompositeMaterialGroupFactory_Impl>(size) as
        Array<IPrinting3DCompositeMaterialGroupFactory?>
  }
}
