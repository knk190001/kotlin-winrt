package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnimatedVisualSource.ABI.IID
import Windows.Foundation.Collections.IMapView
import Windows.UI.Color
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimatedVisualSource2.ABI::class)
@Signature("{1a3b53a7-a8fe-59a1-b544-43a4d9c81ef2}")
@Guid("1a3b53a7a8fe59a1b54443a4d9c81ef2")
@WinRTInterface("1a3b53a7a8fe59a1b54443a4d9c81ef2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualSource2.ByReference::class)
public interface IAnimatedVisualSource2 : NativeMapped, IWinRTInterface, IAnimatedVisualSource {
  @InterfaceMethod(0)
  public fun get_Markers(): IMapView<String?, Double>?

  @InterfaceMethod(1)
  public fun SetColorProperty(propertyName: String?, value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualSource2> {
    public override fun getValue() = ABI.makeIAnimatedVisualSource2(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualSource2, IAnimatedVisualSource.WithDefault {
    public val __1047949261_Ptr: Pointer?

    public val _1047949261_VtblPtr: Pointer?
      get() = __1047949261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Markers(): IMapView<String?, Double>? {
      val fnPtr = _1047949261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, Double>>()
      val hr = fn.invokeHR(arrayOf(__1047949261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetColorProperty(propertyName: String?, value: Color?): Unit {
      val fnPtr = _1047949261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1047949261_Ptr, marshalToNative(propertyName),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimatedVisualSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAnimatedVisualSource {
    public override val __243289851_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1047949261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1047949261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a3b53a7a8fe59a1b54443a4d9c81ef2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualSource2(ptr: Pointer?): WithDefault =
        IAnimatedVisualSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualSource2 {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualSource2(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047949261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualSource2): Array<IAnimatedVisualSource2?> =
        (elements as
        Array<IAnimatedVisualSource2?>).castToImpl<IAnimatedVisualSource2,IAnimatedVisualSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualSource2?> =
        arrayOfNulls<IAnimatedVisualSource2_Impl>(size) as Array<IAnimatedVisualSource2?>
  }
}
