package Windows.UI.Xaml.Controls.Maps

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapContextRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapContextRequestedEventArgs;{fdd1b423-c961-4df2-bb57-82ee0f0bb591})")
@WinRTByReference(brClass = MapContextRequestedEventArgs.ByReference::class)
public class MapContextRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapContextRequestedEventArgs.WithDefault, IWinRTObject {
  private val __2096608941_Interface: IMapContextRequestedEventArgs.WithDefault by lazy {
    as_2096608941()
  }


  public override val __2096608941_Ptr: JNAPointer? by lazy {
    __2096608941_Interface.__2096608941_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2096608941_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2096608941(): IMapContextRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapContextRequestedEventArgs.ABI.makeIMapContextRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapContextRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapContextRequestedEventArgs.ABI.makeIMapContextRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapContextRequestedEventArgs> {
    public override fun getValue() = MapContextRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapContextRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapContextRequestedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapContextRequestedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapContextRequestedEventArgs {
      val address = segment.toRawLongValue()
      return MapContextRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapContextRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
