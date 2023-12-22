package Windows.UI.Input.Spatial

import Windows.UI.Input.Spatial.ISpatialInteractionSourceEventArgs.ABI.IID
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

@ABIMarker(ISpatialInteractionSourceEventArgs2.ABI::class)
@Signature("{d8b4b467-e648-4d52-ab49-e0d227199f63}")
@Guid("d8b4b467e6484d52ab49e0d227199f63")
@WinRTInterface("d8b4b467e6484d52ab49e0d227199f63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceEventArgs2.ByReference::class)
public interface ISpatialInteractionSourceEventArgs2 : NativeMapped, IWinRTInterface,
    ISpatialInteractionSourceEventArgs {
  @InterfaceMethod(0)
  public fun get_PressKind(): SpatialInteractionPressKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceEventArgs2> {
    public override fun getValue() =
        ABI.makeISpatialInteractionSourceEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceEventArgs2,
      ISpatialInteractionSourceEventArgs.WithDefault {
    public val __391371036_Ptr: Pointer?

    public val _391371036_VtblPtr: Pointer?
      get() = __391371036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PressKind(): SpatialInteractionPressKind? {
      val fnPtr = _391371036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionPressKind>()
      val hr = fn.invokeHR(arrayOf(__391371036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionPressKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ISpatialInteractionSourceEventArgs {
    public override val __541564458_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_391371036_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __391371036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8b4b467e6484d52ab49e0d227199f63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceEventArgs2(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceEventArgs2 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__391371036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceEventArgs2):
        Array<ISpatialInteractionSourceEventArgs2?> = (elements as
        Array<ISpatialInteractionSourceEventArgs2?>).castToImpl<ISpatialInteractionSourceEventArgs2,ISpatialInteractionSourceEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceEventArgs2?> =
        arrayOfNulls<ISpatialInteractionSourceEventArgs2_Impl>(size) as
        Array<ISpatialInteractionSourceEventArgs2?>
  }
}
