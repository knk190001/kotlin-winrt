package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapBillboardFactory.ABI::class)
@Signature("{be45a4c5-8f09-4b86-ae28-783740eb8b31}")
@Guid("be45a4c58f094b86ae28783740eb8b31")
@WinRTInterface("be45a4c58f094b86ae28783740eb8b31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapBillboardFactory.ByReference::class)
public interface IMapBillboardFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceFromCamera(camera: MapCamera?): MapBillboard?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapBillboardFactory> {
    public override fun getValue() = ABI.makeIMapBillboardFactory(pointer.getPointer(0))

    public fun setValue(value: IMapBillboardFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapBillboardFactory {
    public val __1945643690_Ptr: Pointer?

    public val _1945643690_VtblPtr: Pointer?
      get() = __1945643690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceFromCamera(camera: MapCamera?): MapBillboard? {
      val fnPtr = _1945643690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapBillboard>()
      val hr = fn.invokeHR(arrayOf(__1945643690_Ptr, marshalToNative(camera), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapBillboard>(result.getValue())
      return resultValue
    }
  }

  public class IMapBillboardFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1945643690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapBillboardFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be45a4c58f094b86ae28783740eb8b31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapBillboardFactory(ptr: Pointer?): WithDefault = IMapBillboardFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapBillboardFactory {
      val address = segment.toRawLongValue()
      return makeIMapBillboardFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapBillboardFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1945643690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapBillboardFactory): Array<IMapBillboardFactory?> =
        (elements as
        Array<IMapBillboardFactory?>).castToImpl<IMapBillboardFactory,IMapBillboardFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapBillboardFactory?> =
        arrayOfNulls<IMapBillboardFactory_Impl>(size) as Array<IMapBillboardFactory?>
  }
}
