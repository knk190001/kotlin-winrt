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

@ABIMarker(IPrinting3DBaseMaterialGroupFactory.ABI::class)
@Signature("{5c1546dc-8697-4193-976b-84bb4116e5bf}")
@Guid("5c1546dc86974193976b84bb4116e5bf")
@WinRTInterface("5c1546dc86974193976b84bb4116e5bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DBaseMaterialGroupFactory.ByReference::class)
public interface IPrinting3DBaseMaterialGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(MaterialGroupId: WinDef.UINT): Printing3DBaseMaterialGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DBaseMaterialGroupFactory> {
    public override fun getValue() =
        ABI.makeIPrinting3DBaseMaterialGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DBaseMaterialGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DBaseMaterialGroupFactory {
    public val __554713836_Ptr: Pointer?

    public val _554713836_VtblPtr: Pointer?
      get() = __554713836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(MaterialGroupId: WinDef.UINT): Printing3DBaseMaterialGroup? {
      val fnPtr = _554713836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DBaseMaterialGroup>()
      val hr = fn.invokeHR(arrayOf(__554713836_Ptr, MaterialGroupId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DBaseMaterialGroup>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DBaseMaterialGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __554713836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DBaseMaterialGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c1546dc86974193976b84bb4116e5bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DBaseMaterialGroupFactory(ptr: Pointer?): WithDefault =
        IPrinting3DBaseMaterialGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DBaseMaterialGroupFactory {
      val address = segment.toRawLongValue()
      return makeIPrinting3DBaseMaterialGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DBaseMaterialGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__554713836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DBaseMaterialGroupFactory):
        Array<IPrinting3DBaseMaterialGroupFactory?> = (elements as
        Array<IPrinting3DBaseMaterialGroupFactory?>).castToImpl<IPrinting3DBaseMaterialGroupFactory,IPrinting3DBaseMaterialGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DBaseMaterialGroupFactory?> =
        arrayOfNulls<IPrinting3DBaseMaterialGroupFactory_Impl>(size) as
        Array<IPrinting3DBaseMaterialGroupFactory?>
  }
}
