package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeoshape.ABI.IID
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IGeopath.ABI::class)
@Signature("{e53fd7b9-2da4-4714-a652-de8593289898}")
@Guid("e53fd7b92da44714a652de8593289898")
@WinRTInterface("e53fd7b92da44714a652de8593289898")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeopath.ByReference::class)
public interface IGeopath : NativeMapped, IWinRTInterface, IGeoshape {
  @InterfaceMethod(0)
  public fun get_Positions(): IVectorView<BasicGeoposition?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeopath> {
    public override fun getValue() = ABI.makeIGeopath(pointer.getPointer(0))

    public fun setValue(value: IGeopath_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeopath, IGeoshape.WithDefault {
    public val __1654581911_Ptr: Pointer?

    public val _1654581911_VtblPtr: Pointer?
      get() = __1654581911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Positions(): IVectorView<BasicGeoposition?>? {
      val fnPtr = _1654581911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BasicGeoposition?>>()
      val hr = fn.invokeHR(arrayOf(__1654581911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<BasicGeoposition?>>(result.getValue())
      return resultValue
    }
  }

  public class IGeopath_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeoshape {
    public override val __244607121_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1654581911_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1654581911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeopath, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e53fd7b92da44714a652de8593289898")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeopath(ptr: Pointer?): WithDefault = IGeopath_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeopath {
      val address = segment.toRawLongValue()
      return makeIGeopath(Pointer(address))
    }

    public override fun toNative(obj: IGeopath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1654581911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeopath): Array<IGeopath?> = (elements as
        Array<IGeopath?>).castToImpl<IGeopath,IGeopath_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeopath?> = arrayOfNulls<IGeopath_Impl>(size) as
        Array<IGeopath?>
  }
}
