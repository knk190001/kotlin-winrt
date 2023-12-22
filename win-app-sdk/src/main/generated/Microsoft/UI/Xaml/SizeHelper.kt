package Microsoft.UI.Xaml

import Windows.Foundation.Size
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Float
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SizeHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.SizeHelper;{5df9eee1-a2a8-5e55-8668-afedc0b36deb})")
@WinRTByReference(brClass = SizeHelper.ByReference::class)
public class SizeHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISizeHelper.WithDefault, IWinRTObject {
  private val __844799338_Interface: ISizeHelper.WithDefault by lazy {
    as_844799338()
  }


  public override val __844799338_Ptr: JNAPointer? by lazy {
    __844799338_Interface.__844799338_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__844799338_Interface)

  private fun as_844799338(): ISizeHelper.WithDefault {
    if(pointer == NULL) {
      return(ISizeHelper.ABI.makeISizeHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISizeHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISizeHelper.ABI.makeISizeHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SizeHelper> {
    public override fun getValue() = SizeHelper(pointer.getPointer(0))

    public fun setValue(value: SizeHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SizeHelper, MemoryAddress> {
    public val ISizeHelperStatics_Instance: ISizeHelperStatics by lazy {
      createISizeHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISizeHelperStatics(): ISizeHelperStatics {
      val refiid = Guid.REFIID(ISizeHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.SizeHelper".toHandle(),refiid,interfacePtr)
      val result = ISizeHelperStatics.ABI.makeISizeHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SizeHelper {
      val address = segment.toRawLongValue()
      return SizeHelper(Pointer(address))
    }

    public override fun toNative(obj: SizeHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Empty() = ABI.ISizeHelperStatics_Instance.get_Empty()

    public fun FromDimensions(width: Float, height: Float) =
        ABI.ISizeHelperStatics_Instance.FromDimensions(width, height)

    public fun GetIsEmpty(target: Size) = ABI.ISizeHelperStatics_Instance.GetIsEmpty(target)

    public fun Equals(target: Size, value: Size) = ABI.ISizeHelperStatics_Instance.Equals(target,
        value)
  }
}
