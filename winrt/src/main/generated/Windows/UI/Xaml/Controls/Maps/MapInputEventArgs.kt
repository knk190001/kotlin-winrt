package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapInputEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapInputEventArgs;{9fc503a0-a8a2-4394-92e9-2247764f2f49})")
@WinRTByReference(brClass = MapInputEventArgs.ByReference::class)
public class MapInputEventArgs(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapInputEventArgs.WithDefault, IWinRTObject {
  private val __1781627592_Interface: IMapInputEventArgs.WithDefault by lazy {
    as_1781627592()
  }


  public override val __1781627592_Ptr: JNAPointer? by lazy {
    __1781627592_Interface.__1781627592_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1781627592_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1781627592(): IMapInputEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapInputEventArgs.ABI.makeIMapInputEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapInputEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapInputEventArgs.ABI.makeIMapInputEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapInputEventArgs> {
    public override fun getValue() = MapInputEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapInputEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapInputEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapInputEventArgs".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): MapInputEventArgs {
      val address = segment.toRawLongValue()
      return MapInputEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapInputEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
